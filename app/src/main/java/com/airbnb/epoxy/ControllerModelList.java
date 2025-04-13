package com.airbnb.epoxy;

import com.airbnb.epoxy.ModelList;

/* loaded from: classes.dex */
class ControllerModelList extends ModelList {

    /* renamed from: d */
    public static final ModelList.ModelListObserver f6889d = new ModelList.ModelListObserver() { // from class: com.airbnb.epoxy.ControllerModelList.1
        @Override // com.airbnb.epoxy.ModelList.ModelListObserver
        /* renamed from: a */
        public void mo4509a(int i2, int i3) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }

        @Override // com.airbnb.epoxy.ModelList.ModelListObserver
        /* renamed from: b */
        public void mo4510b(int i2, int i3) {
            throw new IllegalStateException("Models cannot be changed once they are added to the controller");
        }
    };

    public ControllerModelList(int i2) {
        super(i2);
        if (this.f7011b) {
            throw new IllegalStateException("Notifications already paused");
        }
        this.f7011b = true;
    }
}
