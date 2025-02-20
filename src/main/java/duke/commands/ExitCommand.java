package duke.commands;

import duke.storage.StorageFile;
import duke.task.TaskList;
import duke.ui.Ui;

/**
 * Terminates the program.
 */
public class ExitCommand extends Command {

    public static final String COMMAND_WORD = "bye";
    public static final String MESSAGE_EXIT_ACKNOWLEDGEMENT = "Bye!!";
    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Exits Duke.";

    @Override
    public String execute(TaskList taskList, Ui ui, StorageFile storage) {
        return MESSAGE_EXIT_ACKNOWLEDGEMENT;
    }
}
