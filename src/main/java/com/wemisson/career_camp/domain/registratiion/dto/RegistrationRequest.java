package com.wemisson.career_camp.domain.registratiion.dto;

public record RegistrationRequest(
	String name,
	String churchName,
	String phoneNumber,
	String password,
	Long firstChoiceLectureId,
	Long secondChoiceLectureId,
	Long thirdChoiceLectureId
) {
	public static RegistrationRequest createEmpty() {
		return new RegistrationRequest(
			null,
			null,
			null,
			null,
			null,
			null,
			null
		);
	}
}
