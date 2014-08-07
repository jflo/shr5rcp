/**
 * 
 */
package de.urszeidler.shr5.ecp.service;

import java.util.Date;

import org.eclipse.ui.services.IServiceLocator;

import de.urszeidler.eclipse.shr5.gameplay.CombatTurn;
import de.urszeidler.eclipse.shr5.gameplay.Command;
import de.urszeidler.shr5.scripting.Placement;
import de.urszeidler.shr5.scripting.Script;

/**
 * @author urs
 */
public class ScriptServiceImpl implements ScriptService {

    private Script script;
    private Placement placement;
    private IServiceLocator locator;
    private ScriptViewer scriptViewer;
    private CombatViewer combatViewer;

    public ScriptServiceImpl(IServiceLocator locator) {
        this.locator = locator;
    }

    @Override
    public Script getCurrentScript() {
        return script;
    }

    @Override
    public void setScript(Script script) {
        this.script = script;
        if (scriptViewer != null)
            scriptViewer.setScript(script);

    }

    public Placement getPlacement() {
        return placement;
    }

    public void setPlacement(Placement placement) {
        this.placement = placement;
        if (scriptViewer != null)
            scriptViewer.setPlacement(placement);
    }

    @Override
    public void registerScriptViewer(ScriptViewer viewer) {
        this.scriptViewer = viewer;
    }

    @Override
    public void registerCombatViewer(CombatViewer viewer) {
        this.combatViewer = viewer;
    }

    @Override
    public void setCombatTurn(CombatTurn kr) {
        if (combatViewer != null)
            combatViewer.setCombatTurn(kr);
    }

    @Override
    public void executeCommand(Command command) {
        if (script != null && script.getCommandStack() != null) {
            if (placement != null) {
                Date actualDate = placement.getActualDate();
                if (actualDate != null && command.getDate() == null)
                    command.setDate(actualDate);
            }
            if(scriptViewer!=null && scriptViewer.getCmdCallback()!=null)
                command.setCmdCallback(scriptViewer.getCmdCallback());

            script.getCommandStack().setCurrentCommand(command);
            script.getCommandStack().redo();
        }
    }
}
