package com.p017vk.api.sdk.p018ui;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.p017vk.api.sdk.VKScheduler;
import com.p017vk.api.sdk.utils.VKUtils;
import com.p017vk.api.sdk.utils.VKValidationLocker;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKCaptchaActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKCaptchaActivity;", "Landroid/app/Activity;", "<init>", "()V", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKCaptchaActivity extends Activity {

    /* renamed from: e */
    @Nullable
    public static String f30751e;

    /* renamed from: f */
    public static final Companion f30752f = new Companion(null);

    /* renamed from: b */
    public EditText f30753b;

    /* renamed from: c */
    public ImageView f30754c;

    /* renamed from: d */
    public ProgressBar f30755d;

    /* compiled from: VKCaptchaActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKCaptchaActivity$Companion;", "", "", "KEY_URL", "Ljava/lang/String;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final void m16525a(@NotNull final Context context, @NotNull final String str) {
            Intrinsics.m32180i(context, "context");
            VKScheduler.m16498a(new Runnable() { // from class: com.vk.api.sdk.ui.VKCaptchaActivity$Companion$start$1
                @Override // java.lang.Runnable
                public final void run() {
                    Intent putExtra = new Intent(context, (Class<?>) VKCaptchaActivity.class).addFlags(268435456).putExtra("key_url", str);
                    Intrinsics.m32175d(putExtra, "Intent(context, VKCaptch…  .putExtra(KEY_URL, img)");
                    context.startActivity(putExtra);
                }
            }, 0L, 2);
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        LinearLayout linearLayout = new LinearLayout(this);
        VKUtils vKUtils = VKUtils.f30791a;
        int ceil = (int) Math.ceil(vKUtils.m16536a() * 12);
        int max = (int) (Math.max(1.0f, vKUtils.m16536a()) * 130.0f);
        int max2 = (int) (Math.max(1.0f, vKUtils.m16536a()) * 50.0f);
        linearLayout.setPadding(ceil, ceil, ceil, ceil);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        FrameLayout frameLayout = new FrameLayout(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(max, max2);
        layoutParams.bottomMargin = ceil;
        frameLayout.setLayoutParams(layoutParams);
        this.f30755d = new ProgressBar(this);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ProgressBar progressBar = this.f30755d;
        if (progressBar == null) {
            Intrinsics.m32189r("progress");
            throw null;
        }
        progressBar.setLayoutParams(layoutParams2);
        ProgressBar progressBar2 = this.f30755d;
        if (progressBar2 == null) {
            Intrinsics.m32189r("progress");
            throw null;
        }
        frameLayout.addView(progressBar2);
        this.f30754c = new ImageView(this);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams3.gravity = 17;
        ImageView imageView = this.f30754c;
        if (imageView == null) {
            Intrinsics.m32189r("image");
            throw null;
        }
        imageView.setLayoutParams(layoutParams3);
        ImageView imageView2 = this.f30754c;
        if (imageView2 == null) {
            Intrinsics.m32189r("image");
            throw null;
        }
        frameLayout.addView(imageView2);
        linearLayout.addView(frameLayout);
        EditText editText = new EditText(this);
        this.f30753b = editText;
        editText.setInputType(176);
        EditText editText2 = this.f30753b;
        if (editText2 == null) {
            Intrinsics.m32189r("input");
            throw null;
        }
        editText2.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(max, -2);
        EditText editText3 = this.f30753b;
        if (editText3 == null) {
            Intrinsics.m32189r("input");
            throw null;
        }
        editText3.setLayoutParams(layoutParams4);
        View view = this.f30753b;
        if (view == null) {
            Intrinsics.m32189r("input");
            throw null;
        }
        linearLayout.addView(view);
        new AlertDialog.Builder(this, 5).setView(linearLayout).setTitle(C2507R.string.vk_captcha_hint).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.vk.api.sdk.ui.VKCaptchaActivity$onCreate$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VKCaptchaActivity vKCaptchaActivity = VKCaptchaActivity.this;
                EditText editText4 = vKCaptchaActivity.f30753b;
                if (editText4 == null) {
                    Intrinsics.m32189r("input");
                    throw null;
                }
                VKCaptchaActivity.f30751e = editText4.getText().toString();
                VKValidationLocker.f30797c.m16538b();
                vKCaptchaActivity.finish();
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.vk.api.sdk.ui.VKCaptchaActivity$onCreate$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VKCaptchaActivity vKCaptchaActivity = VKCaptchaActivity.this;
                String str = VKCaptchaActivity.f30751e;
                Objects.requireNonNull(vKCaptchaActivity);
                VKCaptchaActivity.f30751e = null;
                VKValidationLocker.f30797c.m16538b();
                vKCaptchaActivity.setResult(0);
                vKCaptchaActivity.finish();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.vk.api.sdk.ui.VKCaptchaActivity$onCreate$3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                VKCaptchaActivity vKCaptchaActivity = VKCaptchaActivity.this;
                String str = VKCaptchaActivity.f30751e;
                Objects.requireNonNull(vKCaptchaActivity);
                VKCaptchaActivity.f30751e = null;
                VKValidationLocker.f30797c.m16538b();
                vKCaptchaActivity.setResult(0);
                vKCaptchaActivity.finish();
            }
        }).show();
        EditText editText4 = this.f30753b;
        if (editText4 == null) {
            Intrinsics.m32189r("input");
            throw null;
        }
        editText4.requestFocus();
        final String stringExtra = getIntent().getStringExtra("key_url");
        Objects.requireNonNull(VKScheduler.f30657e);
        Lazy lazy = VKScheduler.f30656d;
        KProperty kProperty = VKScheduler.f30653a[1];
        ((ExecutorService) lazy.getValue()).submit(new Runnable() { // from class: com.vk.api.sdk.ui.VKCaptchaActivity$loadImage$1
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
            
                if (r0 == null) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
            
                if (r0 != null) goto L20;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
            
                r0.close();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r5 = this;
                    java.lang.String r0 = r2
                    java.lang.String r1 = "url"
                    kotlin.jvm.internal.Intrinsics.m32175d(r0, r1)
                    r1 = 0
                    okhttp3.Request$Builder r2 = new okhttp3.Request$Builder     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    r2.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    okhttp3.Request$Builder r0 = r2.url(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    okhttp3.Request r0 = r0.build()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    com.vk.api.sdk.VKOkHttpProvider$DefaultProvider r2 = new com.vk.api.sdk.VKOkHttpProvider$DefaultProvider     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    r2.<init>()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    okhttp3.OkHttpClient r2 = r2.mo16496a()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    okhttp3.Call r0 = r2.newCall(r0)     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    okhttp3.Response r0 = r0.execute()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    if (r0 == 0) goto L4a
                    okhttp3.ResponseBody r0 = r0.body()     // Catch: java.lang.Throwable -> L3d java.lang.Exception -> L44
                    if (r0 == 0) goto L3a
                    byte[] r1 = r0.bytes()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L38
                    goto L3a
                L33:
                    r1 = move-exception
                    r4 = r1
                    r1 = r0
                    r0 = r4
                    goto L3e
                L38:
                    goto L45
                L3a:
                    if (r0 == 0) goto L4a
                    goto L47
                L3d:
                    r0 = move-exception
                L3e:
                    if (r1 == 0) goto L43
                    r1.close()
                L43:
                    throw r0
                L44:
                    r0 = r1
                L45:
                    if (r0 == 0) goto L4a
                L47:
                    r0.close()
                L4a:
                    if (r1 == 0) goto L69
                    com.vk.api.sdk.ui.VKCaptchaActivity r0 = com.p017vk.api.sdk.p018ui.VKCaptchaActivity.this
                    r2 = 0
                    int r3 = r1.length
                    android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeByteArray(r1, r2, r3)
                    java.lang.String r2 = "BitmapFactory.decodeByteArray(data, 0, data.size)"
                    kotlin.jvm.internal.Intrinsics.m32175d(r1, r2)
                    java.lang.String r2 = com.p017vk.api.sdk.p018ui.VKCaptchaActivity.f30751e
                    java.util.Objects.requireNonNull(r0)
                    com.vk.api.sdk.ui.VKCaptchaActivity$displayImage$1 r2 = new com.vk.api.sdk.ui.VKCaptchaActivity$displayImage$1
                    r2.<init>()
                    r0 = 0
                    r3 = 2
                    com.p017vk.api.sdk.VKScheduler.m16498a(r2, r0, r3)
                L69:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p017vk.api.sdk.p018ui.VKCaptchaActivity$loadImage$1.run():void");
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        VKValidationLocker.f30797c.m16538b();
        super.onDestroy();
    }
}
