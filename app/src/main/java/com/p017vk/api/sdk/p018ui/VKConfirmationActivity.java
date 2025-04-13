package com.p017vk.api.sdk.p018ui;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.p017vk.api.sdk.VKScheduler;
import com.p017vk.api.sdk.p018ui.VKConfirmationActivity;
import com.p017vk.api.sdk.utils.VKValidationLocker;
import com.swiftsoft.anixartd.C2507R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VKConfirmationActivity.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKConfirmationActivity;", "Landroid/app/Activity;", "<init>", "()V", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class VKConfirmationActivity extends Activity {

    /* renamed from: b */
    public static boolean f30765b;

    /* renamed from: c */
    public static final Companion f30766c = new Companion(null);

    /* compiled from: VKConfirmationActivity.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/ui/VKConfirmationActivity$Companion;", "", "", "KEY_MESSAGE", "Ljava/lang/String;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
        public Companion() {
        }

        /* renamed from: a */
        public final void m16526a(@NotNull final Context context, @NotNull final String str) {
            Intrinsics.m32180i(context, "context");
            VKScheduler.m16498a(new Runnable() { // from class: com.vk.api.sdk.ui.VKConfirmationActivity$Companion$start$1
                @Override // java.lang.Runnable
                public final void run() {
                    Intent putExtra = new Intent(context, (Class<?>) VKConfirmationActivity.class).addFlags(268435456).putExtra("key_message", str);
                    Intrinsics.m32175d(putExtra, "Intent(context, VKConfir…tra(KEY_MESSAGE, message)");
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
        VKValidationLocker.f30797c.m16538b();
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        setContentView(new FrameLayout(this));
        new AlertDialog.Builder(this, 5).setTitle(C2507R.string.vk_confirm).setMessage(getIntent().getStringExtra("key_message")).setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: com.vk.api.sdk.ui.VKConfirmationActivity$onCreate$1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VKConfirmationActivity.Companion companion = VKConfirmationActivity.f30766c;
                VKConfirmationActivity.f30765b = true;
                VKConfirmationActivity.this.finish();
            }
        }).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.vk.api.sdk.ui.VKConfirmationActivity$onCreate$2
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                VKConfirmationActivity.Companion companion = VKConfirmationActivity.f30766c;
                VKConfirmationActivity.f30765b = false;
                VKConfirmationActivity.this.finish();
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.vk.api.sdk.ui.VKConfirmationActivity$onCreate$3
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                VKConfirmationActivity.Companion companion = VKConfirmationActivity.f30766c;
                VKConfirmationActivity.f30765b = false;
                VKConfirmationActivity.this.finish();
            }
        }).show();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        VKValidationLocker.f30797c.m16538b();
    }
}
