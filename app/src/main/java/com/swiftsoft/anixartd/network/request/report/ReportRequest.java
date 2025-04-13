package com.swiftsoft.anixartd.network.request.report;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReportRequest.kt */
@Metadata(m31883d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B!\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00008\u0007¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u00020\b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/request/report/ReportRequest;", "T", "Ljava/io/Serializable;", "", "entityId", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "reasonId", "", "(Ljava/io/Serializable;Ljava/lang/String;J)V", "getEntityId", "()Ljava/io/Serializable;", "Ljava/io/Serializable;", "getMessage", "()Ljava/lang/String;", "getReasonId", "()J", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class ReportRequest<T extends Serializable> {

    @Nullable
    private final T entityId;

    @NotNull
    private final String message;
    private final long reasonId;

    public ReportRequest(@Nullable T t, @NotNull String message, long j2) {
        Intrinsics.m32179h(message, "message");
        this.entityId = t;
        this.message = message;
        this.reasonId = j2;
    }

    @JsonProperty("entity_id")
    @Nullable
    public final T getEntityId() {
        return this.entityId;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @JsonProperty("reason")
    public final long getReasonId() {
        return this.reasonId;
    }

    public /* synthetic */ ReportRequest(Serializable serializable, String str, long j2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : serializable, str, j2);
    }
}
