package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants; 

public class MotorSubsystem extends SubsystemBase {
    public MotorSubsystem() {}
    private TalonFX m_TestMotor = new TalonFX(Constants.MotorConstants.kTestMotorPort);
}