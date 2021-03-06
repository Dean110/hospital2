package high_st_hospital;

public class WaitingRoom extends HospitalRoom {
	@Override
	public void checkIn(Patient patient) {
		roomOccupants.put(patient.getPatientIdentifier(), patient);

	}

	@Override
	public int numberOfPatients() {
		return roomOccupants.size();
	}

	@Override
	public void transfer(Patient testPatient1, HospitalRoom transferTo) {
		roomOccupants.remove(testPatient1.getPatientIdentifier());
		transferTo.checkIn(testPatient1);
	}

}
