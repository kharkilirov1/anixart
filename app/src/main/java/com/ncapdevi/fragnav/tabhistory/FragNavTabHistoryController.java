package com.ncapdevi.fragnav.tabhistory;

import android.os.Bundle;
import com.ncapdevi.fragnav.FragNavTransactionOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FragNavTabHistoryController.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/FragNavTabHistoryController;", "", "Companion", "PopStrategy", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
/* loaded from: classes2.dex */
public interface FragNavTabHistoryController {

    /* compiled from: FragNavTabHistoryController.kt */
    @Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/FragNavTabHistoryController$Companion;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 4, 0})
    public static final class Companion {
    }

    /* compiled from: FragNavTabHistoryController.kt */
    @Metadata(m31882bv = {1, 0, 3}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, m31884d2 = {"Lcom/ncapdevi/fragnav/tabhistory/FragNavTabHistoryController$PopStrategy;", "", "frag-nav_release"}, m31885k = 1, m31886mv = {1, 1, 13})
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention
    public @interface PopStrategy {
    }

    /* renamed from: t0 */
    void mo13843t0(int i2);

    /* renamed from: u0 */
    void mo13840u0(@Nullable Bundle bundle);

    /* renamed from: v0 */
    boolean mo13841v0(int i2, @Nullable FragNavTransactionOptions fragNavTransactionOptions);

    /* renamed from: w0 */
    void mo13842w0(@NotNull Bundle bundle);
}
