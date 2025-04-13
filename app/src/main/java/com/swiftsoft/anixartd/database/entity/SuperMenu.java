package com.swiftsoft.anixartd.database.entity;

import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SuperMenu.kt */
@Metadata(m31883d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m31884d2 = {"Lcom/swiftsoft/anixartd/database/entity/SuperMenu;", "", "id", "", "title", "", "backgroundColor", "", "color", "icon", "newDot", "", "(JLjava/lang/String;IIIZ)V", "getBackgroundColor", "()I", "getColor", "getIcon", "getId", "()J", "setId", "(J)V", "getNewDot", "()Z", "getTitle", "()Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class SuperMenu {
    private final int backgroundColor;
    private final int color;
    private final int icon;
    private long id;
    private final boolean newDot;

    @NotNull
    private final String title;

    public SuperMenu(long j2, @NotNull String title, int i2, int i3, int i4, boolean z) {
        Intrinsics.m32179h(title, "title");
        this.id = j2;
        this.title = title;
        this.backgroundColor = i2;
        this.color = i3;
        this.icon = i4;
        this.newDot = z;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final long getId() {
        return this.id;
    }

    public final boolean getNewDot() {
        return this.newDot;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final void setId(long j2) {
        this.id = j2;
    }

    public /* synthetic */ SuperMenu(long j2, String str, int i2, int i3, int i4, boolean z, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, str, (i5 & 4) != 0 ? C2507R.color.colorAccent : i2, (i5 & 8) != 0 ? C2507R.color.colorAccent : i3, (i5 & 16) != 0 ? C2507R.drawable.ic_discover : i4, (i5 & 32) != 0 ? false : z);
    }
}
