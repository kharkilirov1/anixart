package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.NestedScrollView;
import com.swiftsoft.anixartd.C2507R;
import java.util.Objects;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public class AlertDialog extends AppCompatDialog {

    /* renamed from: f */
    public final AlertController f412f;

    public static class Builder {

        /* renamed from: a */
        public final AlertController.AlertParams f413a;

        /* renamed from: b */
        public final int f414b;

        public Builder(@NonNull Context context) {
            this(context, AlertDialog.m364i(context, 0));
        }

        /* renamed from: a */
        public Builder mo367a(boolean z) {
            this.f413a.f384m = z;
            return this;
        }

        /* renamed from: b */
        public Builder mo368b(@Nullable Drawable drawable) {
            this.f413a.f374c = drawable;
            return this;
        }

        /* renamed from: c */
        public Builder mo369c(@Nullable CharSequence charSequence) {
            this.f413a.f377f = charSequence;
            return this;
        }

        @NonNull
        public AlertDialog create() {
            ListAdapter listAdapter;
            AlertDialog alertDialog = new AlertDialog(this.f413a.f372a, this.f414b);
            AlertController.AlertParams alertParams = this.f413a;
            AlertController alertController = alertDialog.f412f;
            View view = alertParams.f376e;
            if (view != null) {
                alertController.f323G = view;
            } else {
                CharSequence charSequence = alertParams.f375d;
                if (charSequence != null) {
                    alertController.f339e = charSequence;
                    TextView textView = alertController.f321E;
                    if (textView != null) {
                        textView.setText(charSequence);
                    }
                }
                Drawable drawable = alertParams.f374c;
                if (drawable != null) {
                    alertController.f319C = drawable;
                    alertController.f318B = 0;
                    ImageView imageView = alertController.f320D;
                    if (imageView != null) {
                        imageView.setVisibility(0);
                        alertController.f320D.setImageDrawable(drawable);
                    }
                }
            }
            CharSequence charSequence2 = alertParams.f377f;
            if (charSequence2 != null) {
                alertController.f340f = charSequence2;
                TextView textView2 = alertController.f322F;
                if (textView2 != null) {
                    textView2.setText(charSequence2);
                }
            }
            CharSequence charSequence3 = alertParams.f378g;
            if (charSequence3 != null) {
                alertController.m362e(-1, charSequence3, alertParams.f379h, null, null);
            }
            CharSequence charSequence4 = alertParams.f380i;
            if (charSequence4 != null) {
                alertController.m362e(-2, charSequence4, alertParams.f381j, null, null);
            }
            CharSequence charSequence5 = alertParams.f382k;
            if (charSequence5 != null) {
                alertController.m362e(-3, charSequence5, alertParams.f383l, null, null);
            }
            if (alertParams.f388q != null || alertParams.f389r != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) alertParams.f373b.inflate(alertController.f328L, (ViewGroup) null);
                if (alertParams.f393v) {
                    listAdapter = new ArrayAdapter<CharSequence>(alertParams.f372a, alertController.f329M, R.id.text1, alertParams.f388q) { // from class: androidx.appcompat.app.AlertController.AlertParams.1

                        /* renamed from: b */
                        public final /* synthetic */ RecycleListView f397b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00621(Context context, int i2, int i3, CharSequence[] charSequenceArr, RecycleListView recycleListView2) {
                            super(context, i2, i3, charSequenceArr);
                            r6 = recycleListView2;
                        }

                        @Override // android.widget.ArrayAdapter, android.widget.Adapter
                        public View getView(int i2, View view2, ViewGroup viewGroup) {
                            View view3 = super.getView(i2, view2, viewGroup);
                            boolean[] zArr = AlertParams.this.f392u;
                            if (zArr != null && zArr[i2]) {
                                r6.setItemChecked(i2, true);
                            }
                            return view3;
                        }
                    };
                } else {
                    int i2 = alertParams.f394w ? alertController.f330N : alertController.f331O;
                    listAdapter = alertParams.f389r;
                    if (listAdapter == null) {
                        listAdapter = new AlertController.CheckedItemAdapter(alertParams.f372a, i2, R.id.text1, alertParams.f388q);
                    }
                }
                alertController.f324H = listAdapter;
                alertController.f325I = alertParams.f395x;
                if (alertParams.f390s != null) {
                    recycleListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.3

                        /* renamed from: b */
                        public final /* synthetic */ AlertController f404b;

                        public C00643(AlertController alertController2) {
                            r2 = alertController2;
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public void onItemClick(AdapterView<?> adapterView, View view2, int i3, long j2) {
                            AlertParams.this.f390s.onClick(r2.f336b, i3);
                            if (AlertParams.this.f394w) {
                                return;
                            }
                            r2.f336b.dismiss();
                        }
                    });
                } else if (alertParams.f396y != null) {
                    recycleListView2.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.app.AlertController.AlertParams.4

                        /* renamed from: b */
                        public final /* synthetic */ RecycleListView f406b;

                        /* renamed from: c */
                        public final /* synthetic */ AlertController f407c;

                        public C00654(RecycleListView recycleListView2, AlertController alertController2) {
                            r2 = recycleListView2;
                            r3 = alertController2;
                        }

                        @Override // android.widget.AdapterView.OnItemClickListener
                        public void onItemClick(AdapterView<?> adapterView, View view2, int i3, long j2) {
                            boolean[] zArr = AlertParams.this.f392u;
                            if (zArr != null) {
                                zArr[i3] = r2.isItemChecked(i3);
                            }
                            AlertParams.this.f396y.onClick(r3.f336b, i3, r2.isItemChecked(i3));
                        }
                    });
                }
                if (alertParams.f394w) {
                    recycleListView2.setChoiceMode(1);
                } else if (alertParams.f393v) {
                    recycleListView2.setChoiceMode(2);
                }
                alertController2.f341g = recycleListView2;
            }
            View view2 = alertParams.f391t;
            if (view2 != null) {
                alertController2.f342h = view2;
                alertController2.f343i = 0;
                alertController2.f348n = false;
            }
            alertDialog.setCancelable(this.f413a.f384m);
            if (this.f413a.f384m) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            alertDialog.setOnCancelListener(this.f413a.f385n);
            alertDialog.setOnDismissListener(this.f413a.f386o);
            DialogInterface.OnKeyListener onKeyListener = this.f413a.f387p;
            if (onKeyListener != null) {
                alertDialog.setOnKeyListener(onKeyListener);
            }
            return alertDialog;
        }

        /* renamed from: d */
        public Builder mo370d(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f388q = charSequenceArr;
            alertParams.f396y = onMultiChoiceClickListener;
            alertParams.f392u = zArr;
            alertParams.f393v = true;
            return this;
        }

        /* renamed from: e */
        public Builder mo371e(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f380i = charSequence;
            alertParams.f381j = onClickListener;
            return this;
        }

        /* renamed from: f */
        public Builder mo372f(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f382k = alertParams.f372a.getText(i2);
            this.f413a.f383l = onClickListener;
            return this;
        }

        /* renamed from: g */
        public Builder mo373g(DialogInterface.OnDismissListener onDismissListener) {
            this.f413a.f386o = onDismissListener;
            return this;
        }

        @NonNull
        public Context getContext() {
            return this.f413a.f372a;
        }

        /* renamed from: h */
        public Builder mo374h(DialogInterface.OnKeyListener onKeyListener) {
            this.f413a.f387p = onKeyListener;
            return this;
        }

        /* renamed from: i */
        public Builder mo375i(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f378g = charSequence;
            alertParams.f379h = onClickListener;
            return this;
        }

        /* renamed from: j */
        public Builder mo376j(CharSequence[] charSequenceArr, int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f388q = charSequenceArr;
            alertParams.f390s = onClickListener;
            alertParams.f395x = i2;
            alertParams.f394w = true;
            return this;
        }

        /* renamed from: k */
        public Builder mo377k(@StringRes int i2) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f375d = alertParams.f372a.getText(i2);
            return this;
        }

        /* renamed from: l */
        public AlertDialog m378l() {
            AlertDialog create = create();
            create.show();
            return create;
        }

        public Builder setNegativeButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f380i = alertParams.f372a.getText(i2);
            this.f413a.f381j = onClickListener;
            return this;
        }

        public Builder setPositiveButton(@StringRes int i2, DialogInterface.OnClickListener onClickListener) {
            AlertController.AlertParams alertParams = this.f413a;
            alertParams.f378g = alertParams.f372a.getText(i2);
            this.f413a.f379h = onClickListener;
            return this;
        }

        public Builder setTitle(@Nullable CharSequence charSequence) {
            this.f413a.f375d = charSequence;
            return this;
        }

        public Builder setView(View view) {
            this.f413a.f391t = view;
            return this;
        }

        public Builder(@NonNull Context context, @StyleRes int i2) {
            this.f413a = new AlertController.AlertParams(new ContextThemeWrapper(context, AlertDialog.m364i(context, i2)));
            this.f414b = i2;
        }
    }

    public AlertDialog(@NonNull Context context, @StyleRes int i2) {
        super(context, m364i(context, i2));
        this.f412f = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: i */
    public static int m364i(@NonNull Context context, @StyleRes int i2) {
        if (((i2 >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2507R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: g */
    public Button m365g(int i2) {
        AlertController alertController = this.f412f;
        Objects.requireNonNull(alertController);
        if (i2 == -3) {
            return alertController.f357w;
        }
        if (i2 == -2) {
            return alertController.f353s;
        }
        if (i2 != -1) {
            return null;
        }
        return alertController.f349o;
    }

    /* renamed from: h */
    public ListView m366h() {
        return this.f412f.f341g;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i2;
        View view;
        ListAdapter listAdapter;
        View view2;
        View findViewById;
        super.onCreate(bundle);
        AlertController alertController = this.f412f;
        alertController.f336b.setContentView(alertController.f327K == 0 ? alertController.f326J : alertController.f326J);
        View findViewById2 = alertController.f337c.findViewById(C2507R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(C2507R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(C2507R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(C2507R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C2507R.id.customPanel);
        View view3 = alertController.f342h;
        if (view3 == null) {
            view3 = alertController.f343i != 0 ? LayoutInflater.from(alertController.f335a).inflate(alertController.f343i, viewGroup, false) : null;
        }
        boolean z = view3 != null;
        if (!z || !AlertController.m358a(view3)) {
            alertController.f337c.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) alertController.f337c.findViewById(C2507R.id.custom);
            frameLayout.addView(view3, new ViewGroup.LayoutParams(-1, -1));
            if (alertController.f348n) {
                frameLayout.setPadding(alertController.f344j, alertController.f345k, alertController.f346l, alertController.f347m);
            }
            if (alertController.f341g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.LayoutParams) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(C2507R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(C2507R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(C2507R.id.buttonPanel);
        ViewGroup m361d = alertController.m361d(findViewById6, findViewById3);
        ViewGroup m361d2 = alertController.m361d(findViewById7, findViewById4);
        ViewGroup m361d3 = alertController.m361d(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) alertController.f337c.findViewById(C2507R.id.scrollView);
        alertController.f317A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        alertController.f317A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) m361d2.findViewById(R.id.message);
        alertController.f322F = textView;
        if (textView != null) {
            CharSequence charSequence = alertController.f340f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                alertController.f317A.removeView(alertController.f322F);
                if (alertController.f341g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) alertController.f317A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(alertController.f317A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(alertController.f341g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    m361d2.setVisibility(8);
                }
            }
        }
        Button button = (Button) m361d3.findViewById(R.id.button1);
        alertController.f349o = button;
        button.setOnClickListener(alertController.f334R);
        if (TextUtils.isEmpty(alertController.f350p) && alertController.f352r == null) {
            alertController.f349o.setVisibility(8);
            i2 = 0;
        } else {
            alertController.f349o.setText(alertController.f350p);
            Drawable drawable = alertController.f352r;
            if (drawable != null) {
                int i3 = alertController.f338d;
                drawable.setBounds(0, 0, i3, i3);
                alertController.f349o.setCompoundDrawables(alertController.f352r, null, null, null);
            }
            alertController.f349o.setVisibility(0);
            i2 = 1;
        }
        Button button2 = (Button) m361d3.findViewById(R.id.button2);
        alertController.f353s = button2;
        button2.setOnClickListener(alertController.f334R);
        if (TextUtils.isEmpty(alertController.f354t) && alertController.f356v == null) {
            alertController.f353s.setVisibility(8);
        } else {
            alertController.f353s.setText(alertController.f354t);
            Drawable drawable2 = alertController.f356v;
            if (drawable2 != null) {
                int i4 = alertController.f338d;
                drawable2.setBounds(0, 0, i4, i4);
                alertController.f353s.setCompoundDrawables(alertController.f356v, null, null, null);
            }
            alertController.f353s.setVisibility(0);
            i2 |= 2;
        }
        Button button3 = (Button) m361d3.findViewById(R.id.button3);
        alertController.f357w = button3;
        button3.setOnClickListener(alertController.f334R);
        if (TextUtils.isEmpty(alertController.f358x) && alertController.f360z == null) {
            alertController.f357w.setVisibility(8);
            view = null;
        } else {
            alertController.f357w.setText(alertController.f358x);
            Drawable drawable3 = alertController.f360z;
            if (drawable3 != null) {
                int i5 = alertController.f338d;
                drawable3.setBounds(0, 0, i5, i5);
                view = null;
                alertController.f357w.setCompoundDrawables(alertController.f360z, null, null, null);
            } else {
                view = null;
            }
            alertController.f357w.setVisibility(0);
            i2 |= 4;
        }
        Context context = alertController.f335a;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2507R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i2 == 1) {
                alertController.m360b(alertController.f349o);
            } else if (i2 == 2) {
                alertController.m360b(alertController.f353s);
            } else if (i2 == 4) {
                alertController.m360b(alertController.f357w);
            }
        }
        if (!(i2 != 0)) {
            m361d3.setVisibility(8);
        }
        if (alertController.f323G != null) {
            m361d.addView(alertController.f323G, 0, new ViewGroup.LayoutParams(-1, -2));
            alertController.f337c.findViewById(C2507R.id.title_template).setVisibility(8);
        } else {
            alertController.f320D = (ImageView) alertController.f337c.findViewById(R.id.icon);
            if ((!TextUtils.isEmpty(alertController.f339e)) && alertController.f332P) {
                TextView textView2 = (TextView) alertController.f337c.findViewById(C2507R.id.alertTitle);
                alertController.f321E = textView2;
                textView2.setText(alertController.f339e);
                int i6 = alertController.f318B;
                if (i6 != 0) {
                    alertController.f320D.setImageResource(i6);
                } else {
                    Drawable drawable4 = alertController.f319C;
                    if (drawable4 != null) {
                        alertController.f320D.setImageDrawable(drawable4);
                    } else {
                        alertController.f321E.setPadding(alertController.f320D.getPaddingLeft(), alertController.f320D.getPaddingTop(), alertController.f320D.getPaddingRight(), alertController.f320D.getPaddingBottom());
                        alertController.f320D.setVisibility(8);
                    }
                }
            } else {
                alertController.f337c.findViewById(C2507R.id.title_template).setVisibility(8);
                alertController.f320D.setVisibility(8);
                m361d.setVisibility(8);
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i7 = (m361d == null || m361d.getVisibility() == 8) ? 0 : 1;
        boolean z3 = m361d3.getVisibility() != 8;
        if (!z3 && (findViewById = m361d2.findViewById(C2507R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i7 != 0) {
            NestedScrollView nestedScrollView2 = alertController.f317A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (alertController.f340f == null && alertController.f341g == null) ? view : m361d.findViewById(C2507R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = m361d2.findViewById(C2507R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        ListView listView = alertController.f341g;
        if (listView instanceof AlertController.RecycleListView) {
            AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) listView;
            Objects.requireNonNull(recycleListView);
            if (!z3 || i7 == 0) {
                recycleListView.setPadding(recycleListView.getPaddingLeft(), i7 != 0 ? recycleListView.getPaddingTop() : recycleListView.f410b, recycleListView.getPaddingRight(), z3 ? recycleListView.getPaddingBottom() : recycleListView.f411c);
            }
        }
        if (!z2) {
            View view4 = alertController.f341g;
            if (view4 == null) {
                view4 = alertController.f317A;
            }
            if (view4 != null) {
                int i8 = i7 | (z3 ? 2 : 0);
                View findViewById11 = alertController.f337c.findViewById(C2507R.id.scrollIndicatorUp);
                View findViewById12 = alertController.f337c.findViewById(C2507R.id.scrollIndicatorDown);
                if (Build.VERSION.SDK_INT >= 23) {
                    ViewCompat.m2232w0(view4, i8, 3);
                    if (findViewById11 != null) {
                        m361d2.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        m361d2.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i8 & 1) == 0) {
                        m361d2.removeView(findViewById11);
                        findViewById11 = view;
                    }
                    if (findViewById12 == null || (i8 & 2) != 0) {
                        view2 = findViewById12;
                    } else {
                        m361d2.removeView(findViewById12);
                        view2 = view;
                    }
                    if (findViewById11 != null || view2 != null) {
                        if (alertController.f340f != null) {
                            alertController.f317A.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener(alertController, findViewById11, view2) { // from class: androidx.appcompat.app.AlertController.2

                                /* renamed from: a */
                                public final /* synthetic */ View f362a;

                                /* renamed from: b */
                                public final /* synthetic */ View f363b;

                                public C00582(AlertController alertController2, View findViewById112, View view22) {
                                    this.f362a = findViewById112;
                                    this.f363b = view22;
                                }

                                @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
                                /* renamed from: a */
                                public void mo363a(NestedScrollView nestedScrollView3, int i9, int i10, int i11, int i12) {
                                    AlertController.m359c(nestedScrollView3, this.f362a, this.f363b);
                                }
                            });
                            alertController2.f317A.post(new Runnable() { // from class: androidx.appcompat.app.AlertController.3

                                /* renamed from: b */
                                public final /* synthetic */ View f364b;

                                /* renamed from: c */
                                public final /* synthetic */ View f365c;

                                public RunnableC00593(View findViewById112, View view22) {
                                    r2 = findViewById112;
                                    r3 = view22;
                                }

                                @Override // java.lang.Runnable
                                public void run() {
                                    AlertController.m359c(AlertController.this.f317A, r2, r3);
                                }
                            });
                        } else {
                            ListView listView2 = alertController2.f341g;
                            if (listView2 != null) {
                                listView2.setOnScrollListener(new AbsListView.OnScrollListener(alertController2, findViewById112, view22) { // from class: androidx.appcompat.app.AlertController.4

                                    /* renamed from: a */
                                    public final /* synthetic */ View f367a;

                                    /* renamed from: b */
                                    public final /* synthetic */ View f368b;

                                    public C00604(AlertController alertController2, View findViewById112, View view22) {
                                        this.f367a = findViewById112;
                                        this.f368b = view22;
                                    }

                                    @Override // android.widget.AbsListView.OnScrollListener
                                    public void onScroll(AbsListView absListView, int i9, int i10, int i11) {
                                        AlertController.m359c(absListView, this.f367a, this.f368b);
                                    }

                                    @Override // android.widget.AbsListView.OnScrollListener
                                    public void onScrollStateChanged(AbsListView absListView, int i9) {
                                    }
                                });
                                alertController2.f341g.post(new Runnable() { // from class: androidx.appcompat.app.AlertController.5

                                    /* renamed from: b */
                                    public final /* synthetic */ View f369b;

                                    /* renamed from: c */
                                    public final /* synthetic */ View f370c;

                                    public RunnableC00615(View findViewById112, View view22) {
                                        r2 = findViewById112;
                                        r3 = view22;
                                    }

                                    @Override // java.lang.Runnable
                                    public void run() {
                                        AlertController.m359c(AlertController.this.f341g, r2, r3);
                                    }
                                });
                            } else {
                                if (findViewById112 != null) {
                                    m361d2.removeView(findViewById112);
                                }
                                if (view22 != null) {
                                    m361d2.removeView(view22);
                                }
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = alertController2.f341g;
        if (listView3 == null || (listAdapter = alertController2.f324H) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i9 = alertController2.f325I;
        if (i9 > -1) {
            listView3.setItemChecked(i9, true);
            listView3.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f412f.f317A;
        if (nestedScrollView != null && nestedScrollView.m2616i(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f412f.f317A;
        if (nestedScrollView != null && nestedScrollView.m2616i(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i2, keyEvent);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.f412f;
        alertController.f339e = charSequence;
        TextView textView = alertController.f321E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
