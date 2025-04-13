package com.yandex.div.state;

import kotlin.Metadata;

/* compiled from: InMemoryDivStateStorage.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/state/InMemoryDivStateStorage;", "Lcom/yandex/div/state/DivStateStorage;", "div-states_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class InMemoryDivStateStorage implements DivStateStorage {
    public InMemoryDivStateStorage() {
        new InMemoryDivStateCache();
    }
}
