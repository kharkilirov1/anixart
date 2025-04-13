package com.airbnb.epoxy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: GroupModel.kt */
@EpoxyModelClass
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, m31884d2 = {"Lcom/airbnb/epoxy/GroupModel;", "Lcom/airbnb/epoxy/EpoxyModelGroup;", "Lcom/airbnb/epoxy/ModelCollector;", "epoxy-adapter_release"}, m31885k = 1, m31886mv = {1, 4, 2})
/* loaded from: classes.dex */
public abstract class GroupModel extends EpoxyModelGroup implements ModelCollector {
    @Override // com.airbnb.epoxy.ModelCollector
    public void add(@NotNull EpoxyModel<?> model) {
        Intrinsics.m32179h(model, "model");
        this.f6935l |= model.mo4527q2();
        this.f6934k.add(model);
    }
}
