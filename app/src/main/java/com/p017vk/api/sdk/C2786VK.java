package com.p017vk.api.sdk;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import com.fasterxml.jackson.core.util.TextBuffer;
import com.p017vk.api.sdk.auth.VKAccessToken;
import com.p017vk.api.sdk.auth.VKAuthManager;
import com.p017vk.api.sdk.auth.VKAuthParams;
import com.p017vk.api.sdk.auth.VKScope;
import com.p017vk.api.sdk.exceptions.VKApiExecutionException;
import com.p017vk.api.sdk.internal.ApiCommand;
import com.p017vk.api.sdk.p018ui.VKWebViewAuthActivity;
import com.p017vk.api.sdk.requests.VKBooleanRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: VK.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VK;", "", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* renamed from: com.vk.api.sdk.VK */
/* loaded from: classes2.dex */
public final class C2786VK {

    /* renamed from: a */
    @SuppressLint
    public static VKApiConfig f30602a;

    /* renamed from: b */
    @NotNull
    public static VKApiManager f30603b;

    /* renamed from: e */
    public static final C2786VK f30606e = new C2786VK();

    /* renamed from: c */
    public static final VKAuthManager f30604c = new VKAuthManager();

    /* renamed from: d */
    public static final ArrayList<VKTokenExpiredHandler> f30605d = new ArrayList<>();

    @JvmStatic
    /* renamed from: a */
    public static final void m16482a(@NotNull Context context) {
        VKAuthManager vKAuthManager = f30604c;
        int m16500a = vKAuthManager.m16500a(context);
        if (m16500a == 0) {
            throw new RuntimeException("<integer name=\"com_vk_sdk_AppId\">your_app_id</integer> is not found in your resources.xml");
        }
        VKApiConfig vKApiConfig = new VKApiConfig(context, m16500a, new VKDefaultValidationHandler(context), null, null, null, 0L, 0L, null, null, null, false, 0, null, null, 32760);
        f30602a = vKApiConfig;
        f30603b = new VKApiManager(vKApiConfig);
        VKAccessToken m16501b = vKAuthManager.m16501b(vKApiConfig.f30613a);
        if (m16501b != null) {
            VKApiManager vKApiManager = f30603b;
            if (vKApiManager == null) {
                Intrinsics.m32189r("apiManager");
                throw null;
            }
            vKApiManager.m16489a(m16501b.f30662b, m16501b.f30663c);
        }
        if (m16483b()) {
            f30606e.m16486e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m16483b() {
        /*
            com.vk.api.sdk.auth.VKAuthManager r0 = com.p017vk.api.sdk.C2786VK.f30604c
            com.vk.api.sdk.VKApiConfig r1 = com.p017vk.api.sdk.C2786VK.f30602a
            if (r1 == 0) goto L35
            android.content.Context r1 = r1.f30613a
            java.lang.String r2 = "context"
            kotlin.jvm.internal.Intrinsics.m32180i(r1, r2)
            com.vk.api.sdk.auth.VKAccessToken r0 = r0.m16501b(r1)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L34
            long r3 = r0.f30669i
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L30
            long r5 = r0.f30664d
            r0 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r0
            long r3 = r3 * r7
            long r3 = r3 + r5
            long r5 = java.lang.System.currentTimeMillis()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L2e
            goto L30
        L2e:
            r0 = 0
            goto L31
        L30:
            r0 = 1
        L31:
            if (r0 == 0) goto L34
            r1 = 1
        L34:
            return r1
        L35:
            java.lang.String r0 = "config"
            kotlin.jvm.internal.Intrinsics.m32189r(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p017vk.api.sdk.C2786VK.m16483b():boolean");
    }

    @JvmStatic
    @JvmOverloads
    /* renamed from: c */
    public static final void m16484c(@NotNull Activity activity, @NotNull Collection<? extends VKScope> collection) {
        boolean z;
        List<ResolveInfo> queryIntentActivities;
        VKAuthParams vKAuthParams = new VKAuthParams(f30604c.m16500a(activity), "https://oauth.vk.com/blank.html", collection);
        boolean z2 = false;
        try {
            activity.getPackageManager().getPackageInfo("com.vkontakte.android", 1);
            z = true;
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            PackageManager packageManager = activity.getPackageManager();
            if (packageManager != null && (queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.vkontakte.android.action.SDK_AUTH"), TextBuffer.MAX_SEGMENT_LEN)) != null) {
                z2 = !queryIntentActivities.isEmpty();
            }
            if (z2) {
                Intent intent = new Intent("com.vkontakte.android.action.SDK_AUTH", (Uri) null);
                intent.setPackage("com.vkontakte.android");
                Bundle bundle = new Bundle();
                bundle.putInt("client_id", vKAuthParams.f30671b);
                bundle.putBoolean("revoke", true);
                bundle.putString("scope", CollectionsKt.m31989B(vKAuthParams.f30670a, ",", null, null, 0, null, null, 62, null));
                bundle.putString("redirect_url", vKAuthParams.f30672c);
                intent.putExtras(bundle);
                activity.startActivityForResult(intent, 282);
                return;
            }
        }
        VKWebViewAuthActivity.Companion companion = VKWebViewAuthActivity.f30773f;
        Intent intent2 = new Intent(activity, (Class<?>) VKWebViewAuthActivity.class);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("vk_app_id", vKAuthParams.f30671b);
        Set<VKScope> set = vKAuthParams.f30670a;
        ArrayList arrayList = new ArrayList(CollectionsKt.m32032m(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((VKScope) it.next()).name());
        }
        bundle2.putStringArrayList("vk_app_scope", new ArrayList<>(arrayList));
        bundle2.putString("vk_app_redirect_url", vKAuthParams.f30672c);
        Intent putExtra = intent2.putExtra("vk_auth_params", bundle2);
        Intrinsics.m32175d(putExtra, "Intent(activity, VKWebVi…ARAMS, params.toBundle())");
        activity.startActivityForResult(putExtra, 282);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0095 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Type inference failed for: r8v15, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.HashMap] */
    @kotlin.jvm.JvmStatic
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m16485d(int r8, int r9, @org.jetbrains.annotations.Nullable android.content.Intent r10, @org.jetbrains.annotations.NotNull com.p017vk.api.sdk.auth.VKAuthCallback r11) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p017vk.api.sdk.C2786VK.m16485d(int, int, android.content.Intent, com.vk.api.sdk.auth.VKAuthCallback):boolean");
    }

    /* renamed from: e */
    public final void m16486e() {
        final VKBooleanRequest vKBooleanRequest = new VKBooleanRequest("stats.trackVisitor");
        final VKApiCallback vKApiCallback = null;
        Objects.requireNonNull(VKScheduler.f30657e);
        Lazy lazy = VKScheduler.f30656d;
        KProperty kProperty = VKScheduler.f30653a[1];
        ((ExecutorService) lazy.getValue()).submit(new Runnable() { // from class: com.vk.api.sdk.VK$execute$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ApiCommand cmd = ApiCommand.this;
                    VKApiConfig vKApiConfig = C2786VK.f30602a;
                    Intrinsics.m32180i(cmd, "cmd");
                    VKApiManager manager = C2786VK.f30603b;
                    if (manager == null) {
                        Intrinsics.m32189r("apiManager");
                        throw null;
                    }
                    Intrinsics.m32180i(manager, "manager");
                    final Object mo16507b = cmd.mo16507b(manager);
                    VKScheduler.m16498a(new Runnable() { // from class: com.vk.api.sdk.VK$execute$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            VKApiCallback vKApiCallback2 = vKApiCallback;
                            if (vKApiCallback2 != null) {
                                vKApiCallback2.m16488b(mo16507b);
                            }
                        }
                    }, 0L, 2);
                } catch (Exception e2) {
                    VKScheduler.m16498a(new Runnable() { // from class: com.vk.api.sdk.VK$execute$1.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Exception exc = e2;
                            if (exc instanceof VKApiExecutionException) {
                                int i2 = ((VKApiExecutionException) exc).f30698b;
                                if (i2 == 4 || i2 == 5) {
                                    C2786VK c2786vk = C2786VK.f30606e;
                                    VKAuthManager vKAuthManager = C2786VK.f30604c;
                                    VKApiConfig vKApiConfig2 = C2786VK.f30602a;
                                    if (vKApiConfig2 == null) {
                                        Intrinsics.m32189r("config");
                                        throw null;
                                    }
                                    Context context = vKApiConfig2.f30613a;
                                    Intrinsics.m32180i(context, "context");
                                    vKAuthManager.m16502c(context).edit().clear().apply();
                                    Iterator<VKTokenExpiredHandler> it = C2786VK.f30605d.iterator();
                                    while (it.hasNext()) {
                                        it.next().m16499a();
                                    }
                                }
                            }
                            VKApiCallback vKApiCallback2 = vKApiCallback;
                            if (vKApiCallback2 != null) {
                                vKApiCallback2.m16487a(e2);
                            }
                        }
                    }, 0L, 2);
                }
            }
        });
    }
}
