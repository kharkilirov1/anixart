package com.swiftsoft.anixartd.network.response;

import com.swiftsoft.anixartd.database.entity.Release;
import com.swiftsoft.anixartd.network.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScheduleResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\t¨\u0006\u001c"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/ScheduleResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "friday", "", "Lcom/swiftsoft/anixartd/database/entity/Release;", "getFriday", "()Ljava/util/List;", "setFriday", "(Ljava/util/List;)V", "monday", "getMonday", "setMonday", "saturday", "getSaturday", "setSaturday", "sunday", "getSunday", "setSunday", "thursday", "getThursday", "setThursday", "tuesday", "getTuesday", "setTuesday", "wednesday", "getWednesday", "setWednesday", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ScheduleResponse extends Response {

    @NotNull
    private List<Release> friday;

    @NotNull
    private List<Release> monday;

    @NotNull
    private List<Release> saturday;

    @NotNull
    private List<Release> sunday;

    @NotNull
    private List<Release> thursday;

    @NotNull
    private List<Release> tuesday;

    @NotNull
    private List<Release> wednesday;

    public ScheduleResponse() {
        EmptyList emptyList = EmptyList.f63144b;
        this.monday = emptyList;
        this.tuesday = emptyList;
        this.wednesday = emptyList;
        this.thursday = emptyList;
        this.friday = emptyList;
        this.saturday = emptyList;
        this.sunday = emptyList;
    }

    @NotNull
    public final List<Release> getFriday() {
        return this.friday;
    }

    @NotNull
    public final List<Release> getMonday() {
        return this.monday;
    }

    @NotNull
    public final List<Release> getSaturday() {
        return this.saturday;
    }

    @NotNull
    public final List<Release> getSunday() {
        return this.sunday;
    }

    @NotNull
    public final List<Release> getThursday() {
        return this.thursday;
    }

    @NotNull
    public final List<Release> getTuesday() {
        return this.tuesday;
    }

    @NotNull
    public final List<Release> getWednesday() {
        return this.wednesday;
    }

    public final void setFriday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.friday = list;
    }

    public final void setMonday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.monday = list;
    }

    public final void setSaturday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.saturday = list;
    }

    public final void setSunday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.sunday = list;
    }

    public final void setThursday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.thursday = list;
    }

    public final void setTuesday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.tuesday = list;
    }

    public final void setWednesday(@NotNull List<Release> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.wednesday = list;
    }
}
