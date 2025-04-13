package com.p017vk.api.sdk.chain;

import android.os.Bundle;
import com.p017vk.api.sdk.VKApiManager;
import com.p017vk.api.sdk.VKApiValidationHandler;
import com.p017vk.api.sdk.exceptions.VKApiException;
import com.p017vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ValidationHandlerChainCall.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/vk/api/sdk/chain/ValidationHandlerChainCall;", "T", "Lcom/vk/api/sdk/chain/RetryChainCall;", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public final class ValidationHandlerChainCall<T> extends RetryChainCall<T> {

    /* renamed from: c */
    @NotNull
    public final ChainCall<T> f30693c;

    /* JADX WARN: Multi-variable type inference failed */
    public ValidationHandlerChainCall(@NotNull VKApiManager vKApiManager, int i2, @NotNull ChainCall<? extends T> chainCall) {
        super(vKApiManager, i2);
        this.f30693c = chainCall;
    }

    @Override // com.p017vk.api.sdk.chain.ChainCall
    @Nullable
    /* renamed from: a */
    public T mo16503a(@NotNull ChainArgs chainArgs) throws Exception {
        String string;
        String string2;
        String str;
        String string3;
        int i2 = this.f30689b;
        if (i2 >= 0) {
            int i3 = 0;
            while (true) {
                try {
                    return this.f30693c.mo16503a(chainArgs);
                } catch (VKApiExecutionException e2) {
                    int i4 = e2.f30698b;
                    String str2 = "";
                    if (i4 == 14) {
                        Bundle bundle = e2.f30700d;
                        if (bundle == null || (str = bundle.getString("captcha_img", "")) == null) {
                            str = "";
                        }
                        String str3 = (String) m16504b(str, ValidationHandlerChainCall$handleCaptcha$captcha$1.f30694d);
                        if (str3 == null) {
                            throw e2;
                        }
                        Bundle bundle2 = e2.f30700d;
                        if (bundle2 != null && (string3 = bundle2.getString("captcha_sid", "")) != null) {
                            str2 = string3;
                        }
                        chainArgs.f30677a = str2;
                        chainArgs.f30678b = str3;
                    } else {
                        if (i4 == 17) {
                            Bundle bundle3 = e2.f30700d;
                            if (bundle3 != null && (string2 = bundle3.getString("validation_url", "")) != null) {
                                str2 = string2;
                            }
                            VKApiValidationHandler.Credentials credentials = (VKApiValidationHandler.Credentials) m16504b(str2, ValidationHandlerChainCall$handleValidation$credentials$1.f30696d);
                            if (credentials == null || !credentials.f30640a) {
                                throw e2;
                            }
                            VKApiManager vKApiManager = this.f30680a;
                            String str4 = credentials.f30642c;
                            if (str4 == null) {
                                Intrinsics.m32188q();
                                throw null;
                            }
                            String str5 = credentials.f30641b;
                            if (str5 == null) {
                                Intrinsics.m32188q();
                                throw null;
                            }
                            vKApiManager.m16489a(str4, str5);
                        } else {
                            if (!(i4 == 24)) {
                                throw e2;
                            }
                            Bundle bundle4 = e2.f30700d;
                            if (bundle4 != null && (string = bundle4.getString("confirmation_text", "")) != null) {
                                str2 = string;
                            }
                            Boolean bool = (Boolean) m16504b(str2, ValidationHandlerChainCall$handleUserConfirmation$confirmation$1.f30695d);
                            if (bool == null) {
                                throw e2;
                            }
                            if (Intrinsics.m32174c(bool, Boolean.FALSE)) {
                                throw e2;
                            }
                            chainArgs.f30679c = bool.booleanValue();
                        }
                    }
                    if (i3 == i2) {
                        break;
                    }
                    i3++;
                }
            }
        }
        throw new VKApiException("Can't confirm validation due to retry limit!");
    }

    /* renamed from: b */
    public final <T> T m16504b(String str, Function3<? super VKApiValidationHandler, ? super String, ? super VKApiValidationHandler.Callback<T>, Unit> function3) {
        VKApiValidationHandler vKApiValidationHandler = this.f30680a.f30634a;
        if (vKApiValidationHandler == null) {
            return null;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        VKApiValidationHandler.Callback callback = new VKApiValidationHandler.Callback(countDownLatch);
        function3.mo16505k(vKApiValidationHandler, str, callback);
        countDownLatch.await();
        return callback.f30638a;
    }
}
