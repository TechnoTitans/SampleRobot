package frc.robot.sensors;

public interface Encoder {

	double getDistance();
	
	double getSpeed();

	double getSpeedInches();

	void reset();

	void resetToRaw(int position);

	void resetTo(double position);

    double getRawPosition();

    double getInchesPerPulse();
}