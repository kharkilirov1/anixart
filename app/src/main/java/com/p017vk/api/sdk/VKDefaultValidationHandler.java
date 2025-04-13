package com.p017vk.api.sdk;

import android.content.Context;
import android.content.Intent;
import com.p017vk.api.sdk.VKApiValidationHandler;
import com.p017vk.api.sdk.p018ui.VKCaptchaActivity;
import com.p017vk.api.sdk.p018ui.VKConfirmationActivity;
import com.p017vk.api.sdk.p018ui.VKWebViewAuthActivity;
import com.p017vk.api.sdk.utils.VKValidationLocker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VKDefaultValidationHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/vk/api/sdk/VKDefaultValidationHandler;", "Lcom/vk/api/sdk/VKApiValidationHandler;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKDefaultValidationHandler implements VKApiValidationHandler {

    /* renamed from: a */
    @NotNull
    public final Context f30643a;

    public VKDefaultValidationHandler(@NotNull Context context) {
        this.f30643a = context;
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [T, com.vk.api.sdk.VKApiValidationHandler$Credentials] */
    @Override // com.p017vk.api.sdk.VKApiValidationHandler
    /* renamed from: a */
    public void mo16492a(@NotNull String str, @NotNull VKApiValidationHandler.Callback<VKApiValidationHandler.Credentials> callback) {
        VKWebViewAuthActivity.Companion companion = VKWebViewAuthActivity.f30773f;
        VKWebViewAuthActivity.f30772e = null;
        Context context = this.f30643a;
        Intrinsics.m32180i(context, "context");
        Intent putExtra = new Intent(context, (Class<?>) VKWebViewAuthActivity.class).putExtra("vk_validation_url", str);
        Intrinsics.m32175d(putExtra, "Intent(context, VKWebVie…ATION_URL, validationUrl)");
        context.startActivity(putExtra);
        VKValidationLocker.f30797c.m16537a();
        ?? r5 = VKWebViewAuthActivity.f30772e;
        if (r5 != 0) {
            callback.f30638a = r5;
            callback.f30639b.countDown();
        } else {
            callback.f30639b.countDown();
        }
        VKWebViewAuthActivity.f30772e = null;
    }

    @Override // com.p017vk.api.sdk.VKApiValidationHandler
    /* renamed from: b */
    public void mo16493b(@NotNull String str, @NotNull VKApiValidationHandler.Callback<Boolean> callback) {
        VKConfirmationActivity.Companion companion = VKConfirmationActivity.f30766c;
        VKConfirmationActivity.f30765b = false;
        companion.m16526a(this.f30643a, str);
        VKValidationLocker.f30797c.m16537a();
        callback.m16495a(Boolean.valueOf(VKConfirmationActivity.f30765b));
        VKConfirmationActivity.f30765b = false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.String] */
    @Override // com.p017vk.api.sdk.VKApiValidationHandler
    /* renamed from: c */
    public void mo16494c(@NotNull String str, @NotNull VKApiValidationHandler.Callback<String> callback) {
        VKCaptchaActivity.f30752f.m16525a(this.f30643a, str);
        VKValidationLocker.f30797c.m16537a();
        ?? r3 = VKCaptchaActivity.f30751e;
        if (r3 == 0) {
            callback.f30639b.countDown();
        } else {
            callback.f30638a = r3;
            callback.f30639b.countDown();
        }
    }
}
