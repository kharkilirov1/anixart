package com.yandex.div.core;

import java.io.Closeable;
import kotlin.Metadata;

/* compiled from: Disposable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, m31884d2 = {"Lcom/yandex/div/core/Disposable;", "Ljava/lang/AutoCloseable;", "Ljava/io/Closeable;", "Companion", "div-core_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public interface Disposable extends AutoCloseable, Closeable {

    /* renamed from: B1 */
    public static final /* synthetic */ int f30873B1 = 0;

    /* compiled from: Disposable.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0005"}, m31884d2 = {"Lcom/yandex/div/core/Disposable$Companion;", "", "Lcom/yandex/div/core/Disposable;", "NULL", "Lcom/yandex/div/core/Disposable;", "div-core_release"}, m31885k = 1, m31886mv = {1, 5, 1})
    public static final class Companion {
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    void close();
}
