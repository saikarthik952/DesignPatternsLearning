package org.example;

import java.util.List;

public class RunnableTemplate implements Runnable {
    private List<Runnable> commands;
    public RunnableTemplate(List<Runnable> commands)
    {
        this.commands = commands;
    }
    @Override
    public void run() {
        commands.forEach((Runnable::run));
    }
}
