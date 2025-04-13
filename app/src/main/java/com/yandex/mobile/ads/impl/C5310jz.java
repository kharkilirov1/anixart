package com.yandex.mobile.ads.impl;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.mobile.ads.impl.jz */
/* loaded from: classes3.dex */
final class C5310jz extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(@NonNull ConsoleMessage consoleMessage) {
        n60.m26813f("Console message: %s, sourceId: %s, lineNumber: %s", consoleMessage.message(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()));
        return true;
    }
}
