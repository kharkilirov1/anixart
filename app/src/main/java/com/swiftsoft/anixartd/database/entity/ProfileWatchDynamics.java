package com.swiftsoft.anixartd.database.entity;

import androidx.room.Entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.swiftsoft.anixartd.utils.Time;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProfileWatchDynamics.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Metadata(m31883d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0017"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/ProfileWatchDynamics;", "Ljava/io/Serializable;", "()V", "count", "", "getCount", "()I", "setCount", "(I)V", "day", "getDay", "setDay", "id", "", "getId", "()J", "setId", "(J)V", "timestamp", "getTimestamp", "setTimestamp", "toString", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ProfileWatchDynamics implements Serializable {
    private int count;
    private int day;
    private long id;
    private long timestamp;

    public final int getCount() {
        return this.count;
    }

    public final int getDay() {
        return this.day;
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final void setCount(int i2) {
        this.count = i2;
    }

    public final void setDay(int i2) {
        this.day = i2;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public final void setTimestamp(long j2) {
        this.timestamp = j2;
    }

    @NotNull
    public String toString() {
        return Time.f30247a.m16358d(this.timestamp) + " => " + this.count;
    }
}
