package stringPrograms;

import java.util.StringJoiner;

public class StringJoinerClass {

	public static void main(String[] args) {
		String participant1 = "Dhinesh";
		String participant2 = "Jayasudha";
		
		String participant3 = "Aishwarya";
		
		
		
		StringJoiner participants = joinParticipants(participant1, participant2);
		StringJoiner mergedParticipants		  = mergeParticipants(participants, participant3);
		System.out.println("Joined participants: "+ participants);
		System.out.println("Merged participants: "+ mergedParticipants);
	}
	
	public static StringJoiner joinParticipants(String participant1, String participant2) {
		StringJoiner participants = null;
		StringJoiner join = new StringJoiner(",");
		participants = join.add(participant1).add(participant2);				
		return participants;
	}
	
	public static StringJoiner mergeParticipants(StringJoiner participants, String participant3) {
		StringJoiner mergedParticipants = null;
		StringJoiner merger = new StringJoiner(":");
		merger.add(participant3);	
		mergedParticipants = merger.merge(participants);
		
		return mergedParticipants;
	}

}
