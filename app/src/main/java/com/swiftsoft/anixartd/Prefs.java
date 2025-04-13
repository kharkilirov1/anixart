package com.swiftsoft.anixartd;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.room.util.C0576a;
import com.google.firebase.auth.C2052a;
import com.yandex.div2.C3033a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Prefs.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/swiftsoft/anixartd/Prefs;", "", "Companion", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Prefs {

    /* renamed from: a */
    @NotNull
    public final SharedPreferences f25344a;

    /* compiled from: Prefs.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/swiftsoft/anixartd/Prefs$Companion;", "", "", "PREFS_FILENAME", "Ljava/lang/String;", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
    public static final class Companion {
    }

    public Prefs(@NotNull Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.swiftsoft.anixartd.prefs", 0);
        Intrinsics.m32178g(sharedPreferences, "context.getSharedPreferences(PREFS_FILENAME, 0)");
        this.f25344a = sharedPreferences;
    }

    /* renamed from: A */
    public final boolean m14045A() {
        return this.f25344a.getBoolean("IS_REMEMBERING_SKIP_THIRD_PARTY_PLATFORM", false);
    }

    /* renamed from: B */
    public final boolean m14046B() {
        return this.f25344a.getBoolean("IS_REMEMBERING_TYPE_SOURCE", false);
    }

    /* renamed from: C */
    public final boolean m14047C() {
        return this.f25344a.getBoolean("IS_SPONSOR", false);
    }

    /* renamed from: D */
    public final boolean m14048D() {
        return this.f25344a.getBoolean("IS_SPONSORSHIP_PROMOTION", false);
    }

    /* renamed from: E */
    public final void m14049E(boolean z) {
        C3033a.m17749k(this.f25344a, "IS_API_ALT", z);
    }

    /* renamed from: F */
    public final void m14050F(boolean z) {
        C3033a.m17749k(this.f25344a, "IS_API_ALT_AVAILABLE", z);
    }

    /* renamed from: G */
    public final void m14051G(@NotNull String value) {
        Intrinsics.m32179h(value, "value");
        C2052a.m12278m(this.f25344a, "API_ALT_URL", value);
    }

    /* renamed from: H */
    public final void m14052H(@NotNull String value) {
        Intrinsics.m32179h(value, "value");
        C2052a.m12278m(this.f25344a, "API_BASE_URL", value);
    }

    /* renamed from: I */
    public final void m14053I(@NotNull String value) {
        Intrinsics.m32179h(value, "value");
        C2052a.m12278m(this.f25344a, "IMP_MESSAGE_TEXT", value);
    }

    /* renamed from: J */
    public final void m14054J(int i2) {
        C0576a.m4125x(this.f25344a, "LAST_VERSION_CODE", i2);
    }

    /* renamed from: K */
    public final void m14055K(boolean z) {
        C3033a.m17749k(this.f25344a, "IS_REMEMBERING_SKIP_THIRD_PARTY_PLATFORM", z);
    }

    /* renamed from: L */
    public final void m14056L(boolean z) {
        C3033a.m17749k(this.f25344a, "SEARCH_VIDEO_TPP", z);
    }

    /* renamed from: M */
    public final void m14057M(int i2) {
        C0576a.m4125x(this.f25344a, "SELECTED_PLAYER_SPEED", i2);
    }

    /* renamed from: a */
    public final int m14058a() {
        return this.f25344a.getInt("COUNT_SKIP_STREAMING_PLATFORM", 0);
    }

    @NotNull
    /* renamed from: b */
    public final String m14059b() {
        String string = this.f25344a.getString("HOME_CUSTOM_FILTER_TAB_NAME", "");
        return string == null ? "" : string;
    }

    /* renamed from: c */
    public final int m14060c() {
        return this.f25344a.getInt("HOME_CUSTOM_FILTER_TAB_HINT_COUNT", 0);
    }

    /* renamed from: d */
    public final long m14061d() {
        return this.f25344a.getLong("ID", 0L);
    }

    @NotNull
    /* renamed from: e */
    public final String m14062e() {
        String string = this.f25344a.getString("IMP_MESSAGE_BACKGROUND_COLOR", "");
        return string == null ? "" : string;
    }

    /* renamed from: f */
    public final boolean m14063f() {
        return this.f25344a.getBoolean("IMP_MESSAGE_ENABLED", false);
    }

    @NotNull
    /* renamed from: g */
    public final String m14064g() {
        String string = this.f25344a.getString("IMP_MESSAGE_LINK", "");
        return string == null ? "" : string;
    }

    @NotNull
    /* renamed from: h */
    public final String m14065h() {
        String string = this.f25344a.getString("IMP_MESSAGE_TEXT", "");
        return string == null ? "" : string;
    }

    @NotNull
    /* renamed from: i */
    public final String m14066i() {
        String string = this.f25344a.getString("IMP_MESSAGE_TEXT_COLOR", "");
        return string == null ? "" : string;
    }

    /* renamed from: j */
    public final boolean m14067j() {
        return this.f25344a.getBoolean("KODIK_IFRAME_AD", false);
    }

    /* renamed from: k */
    public final int m14068k() {
        return this.f25344a.getInt("LAST_VERSION_CODE", 0);
    }

    /* renamed from: l */
    public final boolean m14069l() {
        return this.f25344a.getBoolean("ONLY_HORIZONTAL_ORIENTATION", false);
    }

    /* renamed from: m */
    public final int m14070m() {
        return this.f25344a.getInt("PLAYER_REWIND_TIME", 85);
    }

    /* renamed from: n */
    public final long m14071n() {
        return this.f25344a.getLong("PRIVILEGE_LEVEL_ID", 1L);
    }

    @NotNull
    /* renamed from: o */
    public final String m14072o() {
        String string = this.f25344a.getString("SEARCH_BAR_ICON_ACTION", "");
        return string == null ? "" : string;
    }

    /* renamed from: p */
    public final boolean m14073p() {
        return this.f25344a.getBoolean("SEARCH_BAR_ICON_TINT", true);
    }

    @NotNull
    /* renamed from: q */
    public final String m14074q() {
        String string = this.f25344a.getString("SEARCH_BAR_ICON_URL", "");
        return string == null ? "" : string;
    }

    @NotNull
    /* renamed from: r */
    public final String m14075r() {
        String string = this.f25344a.getString("SEARCH_BAR_ICON_VALUE", "");
        return string == null ? "" : string;
    }

    /* renamed from: s */
    public final int m14076s() {
        return this.f25344a.getInt("SELECTED_KODIK_VIDEO_QUALITY", 0);
    }

    /* renamed from: t */
    public final int m14077t() {
        return this.f25344a.getInt("SELECTED_PLAYER", 0);
    }

    /* renamed from: u */
    public final int m14078u() {
        return this.f25344a.getInt("SELECTED_PLAYER_SPEED", 3);
    }

    /* renamed from: v */
    public final boolean m14079v() {
        return this.f25344a.getBoolean("SNOWFALL", false);
    }

    @NotNull
    /* renamed from: w */
    public final String m14080w() {
        String string = this.f25344a.getString("TOKEN", "");
        return string == null ? "" : string;
    }

    /* renamed from: x */
    public final int m14081x() {
        return this.f25344a.getInt("VIEW_TYPE", 0);
    }

    /* renamed from: y */
    public final boolean m14082y() {
        return this.f25344a.getBoolean("IS_API_ALT", false);
    }

    /* renamed from: z */
    public final boolean m14083z() {
        return this.f25344a.getBoolean("IS_GUEST", false);
    }
}
