package com.yandex.metrica.impl.p023ob;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import com.yandex.metrica.DoNotInline;
import com.yandex.metrica.impl.p023ob.C3331H;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

@Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, m31884d2 = {"Lcom/yandex/metrica/impl/ob/G;", "", "Landroid/content/Context;", "context", "Lcom/yandex/metrica/impl/ob/D;", "converter", "Lcom/yandex/metrica/impl/ob/H;", "a", "(Landroid/content/Context;Lcom/yandex/metrica/impl/ob/D;)Lcom/yandex/metrica/impl/ob/H;", "<init>", "()V", "mobmetricalib_publicBinaryProdRelease"}, m31885k = 1, m31886mv = {1, 1, 15})
@TargetApi
@DoNotInline
/* renamed from: com.yandex.metrica.impl.ob.G */
/* loaded from: classes2.dex */
public final class C3306G {

    /* renamed from: a */
    @NotNull
    public static final C3306G f42929a = new C3306G();

    /* renamed from: com.yandex.metrica.impl.ob.G$a */
    public static final class a<T, R> implements InterfaceC3728Wm<UsageStatsManager, C3331H.a> {

        /* renamed from: a */
        public final /* synthetic */ C3231D f42930a;

        public a(C3231D c3231d) {
            this.f42930a = c3231d;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3728Wm
        /* renamed from: a */
        public C3331H.a mo18117a(UsageStatsManager usageStatsManager) {
            C3231D c3231d = this.f42930a;
            int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
            Objects.requireNonNull(c3231d);
            if (C3658U2.m19211a(28)) {
                if (C3658U2.m19211a(30) && appStandbyBucket == 45) {
                    return C3331H.a.RESTRICTED;
                }
                if (appStandbyBucket == 10) {
                    return C3331H.a.ACTIVE;
                }
                if (appStandbyBucket == 20) {
                    return C3331H.a.WORKING_SET;
                }
                if (appStandbyBucket == 30) {
                    return C3331H.a.FREQUENT;
                }
                if (appStandbyBucket == 40) {
                    return C3331H.a.RARE;
                }
            }
            return null;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.G$b */
    public static final class b<T, R> implements InterfaceC3728Wm<ActivityManager, Boolean> {

        /* renamed from: a */
        public static final b f42931a = new b();

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3728Wm
        /* renamed from: a */
        public Boolean mo18117a(ActivityManager activityManager) {
            return Boolean.valueOf(activityManager.isBackgroundRestricted());
        }
    }

    private C3306G() {
    }

    @JvmStatic
    @NotNull
    /* renamed from: a */
    public static final C3331H m18116a(@NotNull Context context, @NotNull C3231D converter) {
        return new C3331H((C3331H.a) C3658U2.m19196a(new a(converter), context, "usagestats", "getting app standby bucket", "usageStatsManager"), (Boolean) C3658U2.m19196a(b.f42931a, context, "activity", "getting is background restricted", "activityManager"));
    }
}
