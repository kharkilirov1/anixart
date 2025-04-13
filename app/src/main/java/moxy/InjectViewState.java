package moxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Target;
import moxy.viewstate.MvpViewState;

@Inherited
@Target({ElementType.TYPE})
/* loaded from: classes3.dex */
public @interface InjectViewState {
    Class<? extends MvpViewState> value() default DefaultViewState.class;

    Class<? extends MvpView> view() default DefaultView.class;
}
