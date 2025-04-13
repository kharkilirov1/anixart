package com.yandex.div.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import androidx.annotation.WorkerThread;
import com.yandex.div.histogram.RunnableC2899a;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.util.UiThreadHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: DecodeBase64ImageTask.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/DecodeBase64ImageTask;", "Ljava/lang/Runnable;", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DecodeBase64ImageTask implements Runnable {

    /* renamed from: b */
    @NotNull
    public String f30868b;

    /* renamed from: c */
    public final boolean f30869c;

    /* renamed from: d */
    @NotNull
    public final Function1<Bitmap, Unit> f30870d;

    /* JADX WARN: Multi-variable type inference failed */
    public DecodeBase64ImageTask(@NotNull String base64string, boolean z, @NotNull Function1<? super Bitmap, Unit> onDecoded) {
        Intrinsics.m32179h(base64string, "base64string");
        Intrinsics.m32179h(onDecoded, "onDecoded");
        this.f30868b = base64string;
        this.f30869c = z;
        this.f30870d = onDecoded;
    }

    @Override // java.lang.Runnable
    @WorkerThread
    public void run() {
        String str = this.f30868b;
        if (StringsKt.m33898X(str, "data:", false, 2, null)) {
            str = str.substring(StringsKt.m33877C(str, ',', 0, false, 6, null) + 1);
            Intrinsics.m32178g(str, "this as java.lang.String).substring(startIndex)");
        }
        this.f30868b = str;
        try {
            byte[] decode = Base64.decode(str, 0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            try {
                final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                if (this.f30869c) {
                    this.f30870d.invoke(decodeByteArray);
                    return;
                }
                UiThreadHandler uiThreadHandler = UiThreadHandler.f33903a;
                UiThreadHandler.f33904b.post(new RunnableC2899a(new Function0<Unit>() { // from class: com.yandex.div.core.DecodeBase64ImageTask$run$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public Unit invoke() {
                        DecodeBase64ImageTask.this.f30870d.invoke(decodeByteArray);
                        return Unit.f63088a;
                    }
                }, 1));
            } catch (IllegalArgumentException unused) {
                KLog kLog = KLog.f33717a;
            }
        } catch (IllegalArgumentException unused2) {
            KLog kLog2 = KLog.f33717a;
        }
    }
}
