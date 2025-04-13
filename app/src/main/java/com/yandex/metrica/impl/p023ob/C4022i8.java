package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p022ac.CrashpadHelper;
import java.util.Objects;
import org.json.JSONObject;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.i8 */
/* loaded from: classes2.dex */
public class C4022i8 implements InterfaceC3613S7 {

    /* renamed from: a */
    @NonNull
    private final Context f45320a;

    /* renamed from: b */
    @NonNull
    private final C3659U3 f45321b;

    /* renamed from: c */
    @NonNull
    private C3970g8 f45322c;

    /* renamed from: d */
    @NonNull
    private final InterfaceC3678Um<Bundle> f45323d;

    /* renamed from: e */
    @NonNull
    private final C4126m8 f45324e;

    /* renamed from: f */
    @NonNull
    private final C4230q8 f45325f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC3703Vm<Void, String> f45326g;

    /* renamed from: com.yandex.metrica.impl.ob.i8$a */
    public class a implements InterfaceC3678Um<Bundle> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(Bundle bundle) {
            CrashpadHelper.setUpNativeUncaughtExceptionHandler(bundle);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.i8$b */
    public class b implements InterfaceC3703Vm<Void, String> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public String mo17917a(Void r1) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    public C4022i8(@NonNull Context context, @NonNull C3659U3 c3659u3) {
        this(context, c3659u3, new C3432L0(), new a());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    @NonNull
    /* renamed from: a */
    public String mo19075a() {
        return "appmetrica_native_crashes";
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    @WorkerThread
    /* renamed from: a */
    public void mo19077a(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        C4074k8 m19955b = this.f45322c.m19955b();
        if (m19955b != null) {
            if (TextUtils.isEmpty(m19955b.f45605a) && m19955b.f45608d == null) {
                return;
            }
            this.f45325f.m20573a(str3);
            String str4 = null;
            this.f45325f.m20574b(this.f45326g.mo17917a(null));
            InterfaceC3678Um<Bundle> interfaceC3678Um = this.f45323d;
            String m20572a = this.f45325f.m20572a();
            Bundle bundle = new Bundle();
            C4126m8 c4126m8 = this.f45324e;
            C3659U3 c3659u3 = this.f45321b;
            Objects.requireNonNull(c4126m8);
            try {
                str4 = Base64.encodeToString(new JSONObject().put("arg_cd", new JSONObject().put("arg_ak", str).put("arg_pn", c3659u3.m19232f()).put("arg_pd", c3659u3.m19233g()).put("arg_ps", c3659u3.m19234h()).put("arg_rt", "main")).toString().getBytes(), 0);
            } catch (Throwable unused) {
            }
            bundle.putString("arg_cd", str4);
            bundle.putString("arg_rc", m20572a);
            bundle.putString("arg_dd", str2);
            bundle.putString("arg_hp", m19955b.f45605a);
            bundle.putBoolean("arg_i64", m19955b.f45606b);
            bundle.putBoolean("arg_ul", m19955b.f45607c);
            bundle.putString("arg_sn", this.f45320a.getPackageName() + "-crashpad_new_crash_socket");
            if (m19955b.f45608d == null) {
                bundle.putBoolean("arg_ap", false);
            } else {
                bundle.putBoolean("arg_ap", true);
                Objects.requireNonNull(m19955b.f45608d);
                bundle.putString("arg_mc", "com.yandex.metrica.impl.ac.HandlerRunner");
                bundle.putString("arg_akp", m19955b.f45608d.f44470a);
                bundle.putString("arg_lp", m19955b.f45608d.f44471b);
                bundle.putString("arg_dp", m19955b.f45608d.f44472c);
            }
            interfaceC3678Um.mo17875b(bundle);
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    /* renamed from: b */
    public void mo19079b() {
        CrashpadHelper.cancelSetUpNativeUncaughtExceptionHandler();
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    @NonNull
    /* renamed from: c */
    public String mo19080c() {
        return "appmetrica-native";
    }

    private C4022i8(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C3432L0 c3432l0, @NonNull InterfaceC3678Um<Bundle> interfaceC3678Um) {
        this(context, c3659u3, new C3970g8(context, c3432l0, C3755Y.m19410g().m19414d().m20607b()), interfaceC3678Um, new C4126m8(), new C4230q8(), new b());
    }

    @VisibleForTesting
    public C4022i8(@NonNull Context context, @NonNull C3659U3 c3659u3, @NonNull C3970g8 c3970g8, @NonNull InterfaceC3678Um<Bundle> interfaceC3678Um, @NonNull C4126m8 c4126m8, @NonNull C4230q8 c4230q8, @NonNull InterfaceC3703Vm<Void, String> interfaceC3703Vm) {
        this.f45320a = context;
        this.f45321b = c3659u3;
        this.f45322c = c3970g8;
        this.f45323d = interfaceC3678Um;
        this.f45324e = c4126m8;
        this.f45325f = c4230q8;
        this.f45326g = interfaceC3703Vm;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    /* renamed from: a */
    public void mo19078a(boolean z) {
        CrashpadHelper.logsEnabled(z);
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3613S7
    /* renamed from: a */
    public void mo19076a(@Nullable String str) {
        this.f45325f.m20573a(str);
        CrashpadHelper.updateRuntimeConfig(this.f45325f.m20572a());
    }
}
