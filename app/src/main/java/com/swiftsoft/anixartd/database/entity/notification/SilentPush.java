package com.swiftsoft.anixartd.database.entity.notification;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: SilentPush.kt */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(m31883d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/notification/SilentPush;", "Ljava/io/Serializable;", "()V", "type", "", "getType", "()I", "setType", "(I)V", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public class SilentPush implements Serializable {
    public static final int TYPE_API_URL = 1;
    private int type;

    public final int getType() {
        return this.type;
    }

    public final void setType(int i2) {
        this.type = i2;
    }
}
