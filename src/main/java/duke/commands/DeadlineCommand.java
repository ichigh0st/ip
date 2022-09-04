package duke.commands;

import duke.storage.Storage;
import duke.task.Deadline;
import duke.task.TaskList;

/**
 * Represents a command to add a new Deadline task.
 */
public class DeadlineCommand extends Command {
    public static final String COMMAND_WORD = "deadline";

    private Deadline d;

    /**
     * Constructs a Deadline Command with the Deadline task
     * to be added.
     *
     * @param d The Deadline task to be added.
     */
    public DeadlineCommand(Deadline d) {
        this.d = d;
    }

    /**
     * {@inheritDoc}
     * This command adds the deadline to the task list.
     *
     * @param tasks Contains the task list.
     * @param storage Storage to save and load tasks from a local file.
     */
    @Override
    public String execute(TaskList tasks, Storage storage) {
        return tasks.add(d);
    }
}
