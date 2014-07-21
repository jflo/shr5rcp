package de.urszeidler.shr5.runtime.ui.widgets;

import org.eclipse.core.databinding.observable.list.IListChangeListener;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.list.ListChangeEvent;
import org.eclipse.core.databinding.observable.list.ListDiffEntry;
import org.eclipse.core.databinding.observable.value.IValueChangeListener;
import org.eclipse.core.databinding.observable.value.ValueChangeEvent;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.wb.swt.SWTResourceManager;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.GameplayPackage;
import de.urszeidler.eclipse.shr5.gameplay.InitativePass;
import de.urszeidler.eclipse.shr5.gameplay.SubjectCommand;

public class CombatTurnList extends Composite implements IValueChangeListener, IListChangeListener {

    private WritableValue combatTurn = new WritableValue();
    private Composite composite;
    private Composite composite1;
    private ScrolledComposite scrolledComposite;
    private ListDiffEntry[] listDiff;

    /**
     * Create the composite.
     * 
     * @param parent
     * @param style
     */
    public CombatTurnList(Composite parent, int style) {
        super(parent, style);
        setLayout(new FillLayout(SWT.HORIZONTAL));

        // scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
        // scrolledComposite.setExpandHorizontal(false);
        // scrolledComposite.setExpandVertical(true);

        composite = new Composite(this, SWT.NONE);
        composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_YELLOW));
        composite.setLayout(new FillLayout());

        // Composite composite_1 = new Composite(composite, SWT.NONE);
        // composite_1.setLayout(new GridLayout(1, false));
        //
        // Group group = new Group(composite_1, SWT.NONE);
        // group.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        // group.setText("1");
        // scrolledComposite.setContent(composite);
        // scrolledComposite.setMinSize(200,200);
        // scrolledComposite.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_CYAN));

        // ActionPhaseComposite actionPhaseComposite = new ActionPhaseComposite(scrolledComposite, SWT.BORDER , "");
        combatTurn.addValueChangeListener(this);
    }

    
    @Override
    public void dispose() {
        combatTurn.removeValueChangeListener(this);
        combatTurn.dispose();
        super.dispose();
    }
    
    private void updateCombatTurn() {
//        if (true)
//            return;

        if (composite1 != null)
            composite1.dispose();

        composite1 = new Composite(composite, SWT.NONE);
        composite1.setLayout(new GridLayout(1, true));
        // composite1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
        composite1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WHITE));

        CombatTurn value = (CombatTurn)combatTurn.getValue();
        if (value != null) {
            EList<InitativePass> actionPhases = value.getActionPhases();
            for (InitativePass phaseCmd : actionPhases) {
                ActionPhaseComposite actionPhaseComposite = new ActionPhaseComposite(composite1, SWT.NONE, "Phase :" + phaseCmd.getPhase());
                actionPhaseComposite.setNameable(((SubjectCommand)phaseCmd).getSubject().getCharacter().getPersona());
                actionPhaseComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
                if (phaseCmd.equals(value.getCurrentTurn()))
                    actionPhaseComposite.setActiv(true);
                // actionPhaseComposite.layout(true, true);
                // Label label = new Label(composite1, SWT.BORDER);
                // label.setText("uiiugiS");
            }
        }
        // composite1.pack(true);
        composite1.setSize(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        composite1.layout(true, true);
        composite.setSize(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT));
        // composite.layout(true, true);
        // composite.getParent().layout(true, true);
        composite.getParent().getParent().layout(true, true);
        if (composite.getParent().getParent() instanceof ScrolledComposite) {
            ScrolledComposite sc = (ScrolledComposite)composite.getParent().getParent();
            sc.setMinSize(composite1.computeSize(SWT.DEFAULT, SWT.DEFAULT));

        }
        // scrolledComposite.layout(true,true);
    }

    public void setCombatTurn(CombatTurn ct) {
        combatTurn.setValue(ct);
        IObservableList observeList = EMFObservables.observeList(ct, GameplayPackage.Literals.COMBAT_TURN__ACTION_PHASES);
        observeList.addListChangeListener(this);
        // observeList.addChangeListener(this);
        // updateCombatTurn();

    }

    @Override
    protected void checkSubclass() {
        // Disable the check that prevents subclassing of SWT components
    }

    @Override
    public void handleValueChange(ValueChangeEvent event) {
        updateCombatTurn();
    }

    @Override
    public void handleListChange(ListChangeEvent event) {
       if(this.isDisposed() || ! this.isVisible() )
           return;
        Object source = event.getSource();
        if (source instanceof IObservableList) {
            IObservableList ol = (IObservableList)source;
            if (!ol.isEmpty()) {
                if (!compareDiff(event.diff.getDifferences())) {
                    updateCombatTurn();
                    listDiff = event.diff.getDifferences();
                }
            }
        }
    }

    private boolean compareDiff(ListDiffEntry[] listDiff2) {
        if(listDiff==null)
            return false;
        if(listDiff2.length!=listDiff.length)
            return false;

       for (int i = 0; i < listDiff2.length; i++) {
        ListDiffEntry listDiffEntry = listDiff[i];
        ListDiffEntry listDiffEntry2 = listDiff2[i];
      if (!(listDiffEntry.isAddition()==listDiffEntry2.isAddition() 
            && listDiffEntry.getPosition()==listDiffEntry2.getPosition()
            && listDiffEntry.getElement() != null
            && listDiffEntry.getElement().equals(listDiffEntry2.getElement())
       ))
          return false;
        
    }
        
        return true;
    }
//
//    @Override
//    public void handleChange(ChangeEvent event) {
//        Object source = event.getSource();
//        if (source instanceof IObservableList) {
//            IObservableList ol = (IObservableList)source;
//            if (!ol.isEmpty())
//                updateCombatTurn();
//        }
//
//    }

}