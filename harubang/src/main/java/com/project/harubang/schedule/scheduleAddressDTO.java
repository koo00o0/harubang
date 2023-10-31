package com.project.harubang.schedule;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class scheduleAddressDTO {
	private String addressId;
	private String addressName;
	private float latitude;
	private float longitude;
}
