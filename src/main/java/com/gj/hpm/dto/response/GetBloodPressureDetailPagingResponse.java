package com.gj.hpm.dto.response;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetBloodPressureDetailPagingResponse extends BaseResponse {
    private String id;
    private int systolicPressure;
    private int diastolicPressure;
    private int pulseRate;
    private String statusFlag;
    private DropdownUserResp createBy;
    private LocalDateTime createDate;
    private DropdownUserResp updateBy;
    private LocalDateTime updateDate;

    /**
     * InnerGeneralInformation
     */
    @Setter
    @Getter
    public class DropdownUserResp {
        private String id;
        private String firstName;
        private String lastName;
        private String hn;
    }
}
