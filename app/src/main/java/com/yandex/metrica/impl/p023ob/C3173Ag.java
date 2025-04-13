package com.yandex.metrica.impl.p023ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.IReporter;
import com.yandex.metrica.Revenue;
import com.yandex.metrica.ValidationException;
import com.yandex.metrica.ecommerce.ECommerceEvent;
import com.yandex.metrica.plugins.IPluginReporter;
import com.yandex.metrica.profile.UserProfile;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ag */
/* loaded from: classes2.dex */
public class C3173Ag implements IReporter {

    /* renamed from: b */
    public static final InterfaceC4350uo<String> f42551b = new C4272ro(new C4220po("Event name"));

    /* renamed from: c */
    public static final InterfaceC4350uo<String> f42552c = new C4272ro(new C4220po("Error message"));

    /* renamed from: d */
    public static final InterfaceC4350uo<String> f42553d = new C4272ro(new C4220po("Error identifier"));

    /* renamed from: e */
    public static final InterfaceC4350uo<Throwable> f42554e = new C4272ro(new C4246qo("Unhandled exception"));

    /* renamed from: f */
    public static final InterfaceC4350uo<UserProfile> f42555f = new C4272ro(new C4246qo("User profile"));

    /* renamed from: g */
    public static final InterfaceC4350uo<Revenue> f42556g = new C4272ro(new C4246qo("Revenue"));

    /* renamed from: h */
    public static final InterfaceC4350uo<ECommerceEvent> f42557h = new C4272ro(new C4246qo("ECommerceEvent"));

    /* renamed from: a */
    @NonNull
    private final C4472zg f42558a;

    public C3173Ag() {
        this(new C4472zg());
    }

    @NonNull
    /* renamed from: a */
    public C4472zg m17833a() {
        return this.f42558a;
    }

    @Override // com.yandex.metrica.IReporter
    @NonNull
    public IPluginReporter getPluginExtension() {
        return this.f42558a;
    }

    @Override // com.yandex.metrica.IReporter
    public void pauseSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        ((C4272ro) f42557h).mo18360a(eCommerceEvent);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable Throwable th) throws ValidationException {
        ((C4272ro) f42552c).mo18360a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str) throws ValidationException {
        ((C4272ro) f42551b).mo18360a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportRevenue(@NonNull Revenue revenue) throws ValidationException {
        ((C4272ro) f42556g).mo18360a(revenue);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUnhandledException(@NonNull Throwable th) throws ValidationException {
        ((C4272ro) f42554e).mo18360a(th);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportUserProfile(@NonNull UserProfile userProfile) throws ValidationException {
        ((C4272ro) f42555f).mo18360a(userProfile);
    }

    @Override // com.yandex.metrica.IReporter
    public void resumeSession() {
    }

    @Override // com.yandex.metrica.IReporter
    public void setStatisticsSending(boolean z) {
    }

    @Override // com.yandex.metrica.IReporter
    public void setUserProfileID(@Nullable String str) {
    }

    @VisibleForTesting
    public C3173Ag(@NonNull C4472zg c4472zg) {
        this.f42558a = c4472zg;
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2) {
        ((C4272ro) f42553d).mo18360a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable String str2) throws ValidationException {
        ((C4272ro) f42551b).mo18360a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        ((C4272ro) f42553d).mo18360a(str);
    }

    @Override // com.yandex.metrica.IReporter
    public void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) throws ValidationException {
        ((C4272ro) f42551b).mo18360a(str);
    }
}
