package com.swiftsoft.anixartd.epoxy;

import android.os.Handler;
import com.airbnb.epoxy.EpoxyController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Typed5EpoxyControllerNullable.kt */
@Metadata(m31883d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u00020\u0006B\u0007\b\u0016¢\u0006\u0002\u0010\u0007B\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J?\u0010\u0014\u001a\u00020\u00152\b\u0010\u000e\u001a\u0004\u0018\u00018\u00002\b\u0010\u0010\u001a\u0004\u0018\u00018\u00012\b\u0010\u0011\u001a\u0004\u0018\u00018\u00022\b\u0010\u0012\u001a\u0004\u0018\u00018\u00032\b\u0010\u0013\u001a\u0004\u0018\u00018\u0004H$¢\u0006\u0002\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u0015H\u0016J3\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0012\u001a\u00028\u00032\u0006\u0010\u0013\u001a\u00028\u0004¢\u0006\u0002\u0010\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0010\u001a\u0004\u0018\u00018\u0001X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0002X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0012\u001a\u0004\u0018\u00018\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000fR\u0012\u0010\u0013\u001a\u0004\u0018\u00018\u0004X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u001f"}, m31884d2 = {"Lcom/swiftsoft/anixartd/epoxy/Typed5EpoxyControllerNullable;", "T", "U", "V", "W", "X", "Lcom/airbnb/epoxy/EpoxyController;", "()V", "modelBuildingHandler", "Landroid/os/Handler;", "diffingHandler", "(Landroid/os/Handler;Landroid/os/Handler;)V", "allowModelBuildRequests", "", "data1", "Ljava/lang/Object;", "data2", "data3", "data4", "data5", "buildModels", "", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "moveModel", "fromPosition", "", "toPosition", "requestDelayedModelBuild", "delayMs", "requestModelBuild", "setData", "app_release"}, m31885k = 1, m31886mv = {1, 7, 1}, m31888xi = 48)
/* loaded from: classes2.dex */
public abstract class Typed5EpoxyControllerNullable<T, U, V, W, X> extends EpoxyController {
    private boolean allowModelBuildRequests;

    @Nullable
    private T data1;

    @Nullable
    private U data2;

    @Nullable
    private V data3;

    @Nullable
    private W data4;

    @Nullable
    private X data5;

    public Typed5EpoxyControllerNullable() {
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void buildModels() {
        if (!isBuildingModels()) {
            throw new IllegalStateException("You cannot call `buildModels` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        buildModels(this.data1, this.data2, this.data3, this.data4, this.data5);
    }

    public abstract void buildModels(@Nullable T data1, @Nullable U data2, @Nullable V data3, @Nullable W data4, @Nullable X data5);

    @Override // com.airbnb.epoxy.EpoxyController
    public void moveModel(int fromPosition, int toPosition) {
        this.allowModelBuildRequests = true;
        super.moveModel(fromPosition, toPosition);
        this.allowModelBuildRequests = false;
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void requestDelayedModelBuild(int delayMs) {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestDelayedModelBuild(delayMs);
    }

    @Override // com.airbnb.epoxy.EpoxyController
    public void requestModelBuild() {
        if (!this.allowModelBuildRequests) {
            throw new IllegalStateException("You cannot call `requestModelBuild` directly. Call `setData` instead to trigger a model refresh with new data.");
        }
        super.requestModelBuild();
    }

    public final void setData(T data1, U data2, V data3, W data4, X data5) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.allowModelBuildRequests = true;
        requestModelBuild();
        this.allowModelBuildRequests = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Typed5EpoxyControllerNullable(@NotNull Handler modelBuildingHandler, @NotNull Handler diffingHandler) {
        super(modelBuildingHandler, diffingHandler);
        Intrinsics.m32179h(modelBuildingHandler, "modelBuildingHandler");
        Intrinsics.m32179h(diffingHandler, "diffingHandler");
    }
}
