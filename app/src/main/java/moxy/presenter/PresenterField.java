package moxy.presenter;

import moxy.MvpPresenter;

/* loaded from: classes3.dex */
public abstract class PresenterField<PresentersContainer> {
    public final Class<? extends MvpPresenter> presenterClass;
    public final String presenterId;
    public final String tag;

    public PresenterField(String str, String str2, Class<? extends MvpPresenter> cls) {
        this.tag = str;
        this.presenterId = str2;
        this.presenterClass = cls;
    }

    public abstract void bind(PresentersContainer presenterscontainer, MvpPresenter mvpPresenter);

    public Class<? extends MvpPresenter> getPresenterClass() {
        return this.presenterClass;
    }

    public String getPresenterId() {
        return this.presenterId;
    }

    public String getTag(PresentersContainer presenterscontainer) {
        return this.tag;
    }

    public abstract MvpPresenter<?> providePresenter(PresentersContainer presenterscontainer);
}
