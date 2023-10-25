package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.MotorSubsystem;

public class MoveCommand extends CommandBase{

    private MotorSubsystem m_subsystem;
  
    /**
     * Creates a new ExampleCommand.
     *
     * @param subsystem The subsystem used by this command.
     */
    public MoveCommand(MotorSubsystem subsystem, double timeout) {
      m_subsystem = subsystem;
      // Use addRequirements() here to declare subsystem dependencies.
      addRequirements(subsystem);
    }
  
    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
    }
  
    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
    }
  
    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        return (Boolean) null;
    }

    /* 
     * The purpose of the timeout is to allow for a delay between actions ran
     * This allows for modification and adjustability between when actions are ran
     * the delay is set within each auto meaning that the time between when the soleniod is toggeled is different for each auto
     */ 
    
}