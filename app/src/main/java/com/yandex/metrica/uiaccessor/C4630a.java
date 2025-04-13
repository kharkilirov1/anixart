package com.yandex.metrica.uiaccessor;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;

/* renamed from: com.yandex.metrica.uiaccessor.a */
/* loaded from: classes2.dex */
public class C4630a implements InterfaceC4631b {

    /* renamed from: a */
    @NonNull
    public final a f47604a;

    /* renamed from: b */
    @Nullable
    public FragmentManager.FragmentLifecycleCallbacks f47605b;

    /* renamed from: com.yandex.metrica.uiaccessor.a$a */
    public interface a {
        void fragmentAttached(@NonNull Activity activity);
    }

    public C4630a(@NonNull a aVar) throws Throwable {
        this.f47604a = aVar;
    }

    @Override // com.yandex.metrica.uiaccessor.InterfaceC4631b
    public void subscribe(@NonNull Activity activity) throws Throwable {
        if (activity instanceof FragmentActivity) {
            if (this.f47605b == null) {
                this.f47605b = new FragmentLifecycleCallback(this.f47604a, activity);
            }
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            supportFragmentManager.m3053r0(this.f47605b);
            supportFragmentManager.m3025d0(this.f47605b, true);
        }
    }

    @Override // com.yandex.metrica.uiaccessor.InterfaceC4631b
    public void unsubscribe(@NonNull Activity activity) throws Throwable {
        if (!(activity instanceof FragmentActivity) || this.f47605b == null) {
            return;
        }
        ((FragmentActivity) activity).getSupportFragmentManager().m3053r0(this.f47605b);
    }
}
