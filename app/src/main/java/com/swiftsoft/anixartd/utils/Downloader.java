package com.swiftsoft.anixartd.utils;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Downloader.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/swiftsoft/anixartd/utils/Downloader;", "", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class Downloader {

    /* renamed from: a */
    @NotNull
    public static final Downloader f30164a = new Downloader();

    /* renamed from: a */
    public final void m16326a(@NotNull Context context, @NotNull String str, @Nullable String str2) {
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        if (downloadManager != null) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str2);
            MimeTypes mimeTypes = MimeTypes.f30167a;
            if (str2 == null) {
                try {
                    String decode = URLDecoder.decode(str, "CP1251");
                    Intrinsics.m32178g(decode, "decode(url, \"CP1251\")");
                    str = decode;
                } catch (UnsupportedEncodingException e2) {
                    e2.printStackTrace();
                }
                int m33880F = StringsKt.m33880F(str, JsonPointer.SEPARATOR, 0, false, 6, null);
                if (m33880F != -1) {
                    str = str.substring(m33880F + 1);
                    Intrinsics.m32178g(str, "this as java.lang.String).substring(startIndex)");
                }
            } else {
                str = str2;
            }
            HashMap<String, String> hashMap = MimeTypes.f30168b;
            int m33880F2 = StringsKt.m33880F(str, '.', 0, false, 6, null);
            if (m33880F2 != -1) {
                str = str.substring(m33880F2 + 1);
                Intrinsics.m32178g(str, "this as java.lang.String).substring(startIndex)");
            }
            request.setMimeType(hashMap.get(str));
            request.setTitle(str2);
            request.setDescription(str2);
            request.addRequestHeader("User-Agent", "Mozilla/5.0 (Linux; Android 5.1.1; Nexus 5 Build/LMY48B; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/43.0.2357.65 Mobile Safari/537.36");
            downloadManager.enqueue(request);
        }
    }
}
