package com.swiftsoft.anixartd.network.response.release.episode;

import com.swiftsoft.anixartd.database.entity.episode.Type;
import com.swiftsoft.anixartd.network.Response;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TypesResponse.kt */
@Metadata(m31883d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, m31884d2 = {"Lcom/swiftsoft/anixartd/network/response/release/episode/TypesResponse;", "Lcom/swiftsoft/anixartd/network/Response;", "()V", "types", "", "Lcom/swiftsoft/anixartd/database/entity/episode/Type;", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public final class TypesResponse extends Response {

    @NotNull
    private List<Type> types = EmptyList.f63144b;

    @NotNull
    public final List<Type> getTypes() {
        return this.types;
    }

    public final void setTypes(@NotNull List<Type> list) {
        Intrinsics.m32179h(list, "<set-?>");
        this.types = list;
    }
}
