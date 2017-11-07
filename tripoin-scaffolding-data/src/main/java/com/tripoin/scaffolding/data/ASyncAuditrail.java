package com.tripoin.scaffolding.data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * created on 12/26/2016
 *
 * @author <a href="mailto:fauzi.knightmaster.achmad@gmail.com">Achmad Fauzi</a>
 */
@MappedSuperclass
public abstract class ASyncAuditrail extends AAuditTrail {

    /**
     *
     *
     */
    private static final long serialVersionUID = 4850400058779906L;

    private Integer sync;

    @Column(name = "sync")
    public Integer getSync() {
        return sync;
    }

    public void setSync(Integer sync) {
        this.sync = sync;
    }

    @Override
    public String toString() {
        return "ASyncAuditrail{" +
                "sync=" + sync +
                '}';
    }
}
