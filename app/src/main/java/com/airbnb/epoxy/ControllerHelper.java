package com.airbnb.epoxy;

import com.airbnb.epoxy.EpoxyController;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ControllerHelper<T extends EpoxyController> {
    public abstract void resetAutoModels();

    public void setControllerToStageTo(EpoxyModel<?> epoxyModel, T t) {
        epoxyModel.f6928e = t;
    }

    public void validateModelHashCodesHaveNotChanged(T t) {
        List<? extends EpoxyModel<?>> list = t.getAdapter().f6909h.f6848f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.get(i2).m4529t2("Model has changed since it was added to the controller.", i2);
        }
    }
}
