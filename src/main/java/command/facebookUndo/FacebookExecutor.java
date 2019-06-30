package command.facebookUndo;

import java.util.Stack;

class FacebookExecutor
{
    private Stack<Command> undo;
    private Stack<Command> redo;

    FacebookExecutor()
    {
        this.undo = new Stack<>();
        this.redo = new Stack<>();
    }

    void perform(Command command)
    {
        if(!(command instanceof DisplayFriendsCommand)) {
            undo.push(command);
        }
        command.execute();
    }

    void undo()
    {
        if(!undo.empty()) {
            Command command = undo.pop();
            redo.push(command);
            command.undo();
        }
    }

    void redo()
    {
      if(!redo.empty()) {
          Command command = redo.pop();
          undo.push(command);
          command.execute();
      }
    }

}
