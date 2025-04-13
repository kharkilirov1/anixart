package com.p017vk.api.sdk.requests;

import androidx.emoji2.text.flatbuffer.C0321a;
import com.p017vk.api.sdk.VKApiConfig;
import com.p017vk.api.sdk.VKApiManager;
import com.p017vk.api.sdk.VKApiResponseParser;
import com.p017vk.api.sdk.VKMethodCall;
import com.p017vk.api.sdk.chain.ChainArgs;
import com.p017vk.api.sdk.chain.InternalErrorRetryChainCall;
import com.p017vk.api.sdk.chain.InvalidCredentialsObserverChainCall;
import com.p017vk.api.sdk.chain.MethodChainCall;
import com.p017vk.api.sdk.chain.RetryChainCall;
import com.p017vk.api.sdk.chain.TooManyRequestRetryChainCall;
import com.p017vk.api.sdk.chain.ValidationHandlerChainCall;
import com.p017vk.api.sdk.exceptions.VKApiException;
import com.p017vk.api.sdk.exceptions.VKApiExecutionException;
import com.p017vk.api.sdk.internal.ApiCommand;
import com.p017vk.api.sdk.okhttp.OkHttpExecutor;
import com.p017vk.api.sdk.okhttp.OkHttpMethodCall;
import com.yandex.mobile.ads.C4632R;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* compiled from: VKRequest.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/requests/VKRequest;", "T", "Lcom/vk/api/sdk/VKApiResponseParser;", "Lcom/vk/api/sdk/internal/ApiCommand;", "Companion", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public class VKRequest<T> extends ApiCommand<T> implements VKApiResponseParser<T> {

    /* renamed from: a */
    @NotNull
    public final LinkedHashMap<String, String> f30749a = new LinkedHashMap<>();

    /* renamed from: b */
    @NotNull
    public String f30750b;

    /* compiled from: VKRequest.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m31884d2 = {"Lcom/vk/api/sdk/requests/VKRequest$Companion;", "", "", "ERROR_MALFORMED_RESPONSE", "I", "libapi-sdk-core_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    public VKRequest(@NotNull String str) {
        this.f30750b = str;
    }

    @Override // com.p017vk.api.sdk.VKApiResponseParser
    /* renamed from: a */
    public T mo16490a(@NotNull String str) throws VKApiException {
        try {
            return mo16524c(new JSONObject(str));
        } catch (Throwable th) {
            String str2 = this.f30750b;
            StringBuilder m2872a = C0321a.m2872a('[');
            m2872a.append(this.f30750b);
            m2872a.append("] ");
            m2872a.append(th.getLocalizedMessage());
            throw new VKApiExecutionException(-2, str2, true, m2872a.toString(), null, null, null, C4632R.styleable.AppCompatTheme_toolbarNavigationButtonStyle);
        }
    }

    @Override // com.p017vk.api.sdk.internal.ApiCommand
    /* renamed from: b */
    public T mo16507b(@NotNull VKApiManager manager) throws InterruptedException, IOException, VKApiException {
        Intrinsics.m32180i(manager, "manager");
        VKApiConfig vKApiConfig = manager.f30636c;
        this.f30749a.put("lang", vKApiConfig.f30627o);
        this.f30749a.put("device_id", vKApiConfig.f30616d.getValue());
        this.f30749a.put("v", vKApiConfig.f30617e);
        VKMethodCall.Builder builder = new VKMethodCall.Builder();
        LinkedHashMap<String, String> args = this.f30749a;
        Intrinsics.m32180i(args, "args");
        builder.f30650c.putAll(args);
        String method = this.f30750b;
        Intrinsics.m32180i(method, "method");
        builder.f30648a = method;
        String version = vKApiConfig.f30617e;
        Intrinsics.m32180i(version, "version");
        builder.f30649b = version;
        VKMethodCall vKMethodCall = new VKMethodCall(builder);
        Lazy lazy = manager.f30635b;
        KProperty kProperty = VKApiManager.f30633d[0];
        OkHttpExecutor okHttpExecutor = (OkHttpExecutor) lazy.getValue();
        OkHttpMethodCall.Builder builder2 = new OkHttpMethodCall.Builder();
        String method2 = vKMethodCall.f30644a;
        Intrinsics.m32180i(method2, "method");
        builder2.f30735a = method2;
        String version2 = vKMethodCall.f30645b;
        Intrinsics.m32180i(version2, "version");
        builder2.f30736b = version2;
        Map<String, String> args2 = vKMethodCall.f30646c;
        Intrinsics.m32180i(args2, "args");
        builder2.f30737c.putAll(args2);
        RetryChainCall tooManyRequestRetryChainCall = new TooManyRequestRetryChainCall(manager, vKMethodCall.f30647d, new InvalidCredentialsObserverChainCall(manager, new ValidationHandlerChainCall(manager, vKMethodCall.f30647d, new MethodChainCall(manager, okHttpExecutor, builder2, manager.f30636c.f30616d.getValue(), manager.f30636c.f30627o, this))));
        int i2 = vKMethodCall.f30647d;
        if (i2 > 0) {
            tooManyRequestRetryChainCall = new InternalErrorRetryChainCall(manager, i2, tooManyRequestRetryChainCall);
        }
        T mo16503a = tooManyRequestRetryChainCall.mo16503a(new ChainArgs());
        if (mo16503a != null) {
            return mo16503a;
        }
        Intrinsics.m32188q();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public T mo16524c(@NotNull JSONObject jSONObject) throws Exception {
        return jSONObject;
    }
}
