package com.honest.truth.domain;

/**
 * ����remark, status, id�ֶ�
 *
 */
public class RemarkStatusId extends RemarkId{
    /** ״̬,1:����,0:�쳣*/
    protected Byte status;

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}
