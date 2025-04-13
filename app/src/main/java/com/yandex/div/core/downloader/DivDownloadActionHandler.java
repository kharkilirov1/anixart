package com.yandex.div.core.downloader;

import android.net.Uri;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.images.LoadReference;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div2.DivDownloadCallbacks;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DivDownloadActionHandler.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/downloader/DivDownloadActionHandler;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class DivDownloadActionHandler {

    /* renamed from: a */
    @NotNull
    public static final DivDownloadActionHandler f31155a = new DivDownloadActionHandler();

    @JvmStatic
    /* renamed from: a */
    public static final boolean m16660a(@Nullable Uri uri, @NotNull DivViewFacade divViewFacade) {
        Intrinsics.m32179h(divViewFacade, "divViewFacade");
        String authority = uri == null ? null : uri.getAuthority();
        if (authority == null || !Intrinsics.m32174c("download", authority)) {
            return false;
        }
        if (uri.getQueryParameter("url") == null) {
            int i2 = Assert.f33709a;
            return false;
        }
        if (divViewFacade instanceof Div2View) {
            return true;
        }
        int i3 = Assert.f33709a;
        return false;
    }

    /* renamed from: b */
    public final boolean m16661b(Uri uri, final DivDownloadCallbacks divDownloadCallbacks, final Div2View div2View) {
        String queryParameter = uri.getQueryParameter("url");
        if (queryParameter == null) {
            return false;
        }
        LoadReference loadRef = div2View.getDiv2Component().mo16638j().mo16662a(div2View, queryParameter, new DivPatchDownloadCallback(div2View, divDownloadCallbacks) { // from class: com.yandex.div.core.downloader.DivDownloadActionHandler$handleAction$callback$1
        });
        Intrinsics.m32178g(loadRef, "loadRef");
        div2View.m16811l(loadRef, div2View);
        return true;
    }
}
