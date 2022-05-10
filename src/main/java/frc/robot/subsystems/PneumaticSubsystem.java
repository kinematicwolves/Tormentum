// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.lang.ref.PhantomReference;

import com.fasterxml.jackson.annotation.Nulls;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class PneumaticSubsystem extends SubsystemBase {
    //private final PneumaticsControlModule pcm = new PneumaticsControlModule();
    private final PneumaticsControlModule pHub = new PneumaticsControlModule(0);
   // private final DoubleSolenoid Cannon1 = pHub.makeDoubleSolenoid(Constants.CANNON_SOL_1, Constants.CANNON_SOL_2);
    private final Solenoid Solenoid1 = new Solenoid(PneumaticsModuleType.CTREPCM,Constants.CANNON_SOL_1);
   /** Creates a new PneumaticSubsystem. */
  
  
  
    public PneumaticSubsystem() {}
  
    @Override
    public void periodic() {
      // This method will be called once per scheduler run
    }
  
    public void fireCannon1() {
      Solenoid1.set(true);
    }

    public void undeployCannon1(){
      Solenoid1.set(false);
    }
    }
//alex did all of this 