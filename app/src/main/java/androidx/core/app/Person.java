package androidx.core.app;

import android.app.Person;
import android.os.PersistableBundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class Person {

    /* renamed from: a */
    @Nullable
    public CharSequence f3250a;

    /* renamed from: b */
    @Nullable
    public IconCompat f3251b;

    /* renamed from: c */
    @Nullable
    public String f3252c;

    /* renamed from: d */
    @Nullable
    public String f3253d;

    /* renamed from: e */
    public boolean f3254e;

    /* renamed from: f */
    public boolean f3255f;

    @RequiresApi
    public static class Api22Impl {
        @DoNotInline
        /* renamed from: a */
        public static Person m1631a(PersistableBundle persistableBundle) {
            Builder builder = new Builder();
            builder.f3256a = persistableBundle.getString("name");
            builder.f3258c = persistableBundle.getString("uri");
            builder.f3259d = persistableBundle.getString("key");
            builder.f3260e = persistableBundle.getBoolean("isBot");
            builder.f3261f = persistableBundle.getBoolean("isImportant");
            return new Person(builder);
        }

        @DoNotInline
        /* renamed from: b */
        public static PersistableBundle m1632b(Person person) {
            PersistableBundle persistableBundle = new PersistableBundle();
            CharSequence charSequence = person.f3250a;
            persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
            persistableBundle.putString("uri", person.f3252c);
            persistableBundle.putString("key", person.f3253d);
            persistableBundle.putBoolean("isBot", person.f3254e);
            persistableBundle.putBoolean("isImportant", person.f3255f);
            return persistableBundle;
        }
    }

    @RequiresApi
    public static class Api28Impl {
        @DoNotInline
        /* renamed from: a */
        public static Person m1633a(android.app.Person person) {
            Builder builder = new Builder();
            builder.f3256a = person.getName();
            builder.f3257b = person.getIcon() != null ? IconCompat.m1863d(person.getIcon()) : null;
            builder.f3258c = person.getUri();
            builder.f3259d = person.getKey();
            builder.f3260e = person.isBot();
            builder.f3261f = person.isImportant();
            return new Person(builder);
        }

        @DoNotInline
        /* renamed from: b */
        public static android.app.Person m1634b(Person person) {
            Person.Builder name = new Person.Builder().setName(person.f3250a);
            IconCompat iconCompat = person.f3251b;
            return name.setIcon(iconCompat != null ? iconCompat.m1873m() : null).setUri(person.f3252c).setKey(person.f3253d).setBot(person.f3254e).setImportant(person.f3255f).build();
        }
    }

    public static class Builder {

        /* renamed from: a */
        @Nullable
        public CharSequence f3256a;

        /* renamed from: b */
        @Nullable
        public IconCompat f3257b;

        /* renamed from: c */
        @Nullable
        public String f3258c;

        /* renamed from: d */
        @Nullable
        public String f3259d;

        /* renamed from: e */
        public boolean f3260e;

        /* renamed from: f */
        public boolean f3261f;
    }

    public Person(Builder builder) {
        this.f3250a = builder.f3256a;
        this.f3251b = builder.f3257b;
        this.f3252c = builder.f3258c;
        this.f3253d = builder.f3259d;
        this.f3254e = builder.f3260e;
        this.f3255f = builder.f3261f;
    }
}
