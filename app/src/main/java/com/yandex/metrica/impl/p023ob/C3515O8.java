package com.yandex.metrica.impl.p023ob;

import com.yandex.metrica.YandexMetrica;
import com.yandex.metrica.impl.p023ob.C3265E8;
import com.yandex.metrica.impl.p023ob.C3456M;
import com.yandex.metrica.impl.p023ob.C3696Vf;
import java.util.List;
import java.util.Locale;
import p000a.C0000a;

/* renamed from: com.yandex.metrica.impl.ob.O8 */
/* loaded from: classes2.dex */
public final class C3515O8 {

    /* renamed from: a */
    public static final int f43538a = YandexMetrica.getLibraryApiLevel();

    /* renamed from: b */
    private static final C4360v8 f43539b;

    /* renamed from: c */
    private static final C4412x8 f43540c;

    /* renamed from: d */
    private static final C4334u8 f43541d;

    /* renamed from: com.yandex.metrica.impl.ob.O8$a */
    public interface a {

        /* renamed from: a */
        public static final List<String> f43542a = C3658U2.m19204a("incremental_id", "timestamp", "data");

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$a, reason: collision with other inner class name */
        public interface InterfaceC6997a {

            /* renamed from: a */
            public static final String f43543a;

            /* renamed from: b */
            public static final String f43544b;

            static {
                Locale locale = Locale.US;
                f43543a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", "lbs_dat");
                f43544b = String.format(locale, "DROP TABLE IF EXISTS %s", "lbs_dat");
            }
        }

        /* renamed from: com.yandex.metrica.impl.ob.O8$a$b */
        public interface b {

            /* renamed from: a */
            public static final String f43545a;

            /* renamed from: b */
            public static final String f43546b;

            static {
                Locale locale = Locale.US;
                f43545a = String.format(locale, "CREATE TABLE IF NOT EXISTS %s (incremental_id INTEGER NOT NULL,timestamp INTEGER, data TEXT)", "l_dat");
                f43546b = String.format(locale, "DROP TABLE IF EXISTS %s", "l_dat");
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$b */
    public static final class b {

        /* renamed from: a */
        public static final List<String> f43547a = C3658U2.m19204a("data_key", "value");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$c */
    public interface c {

        /* renamed from: a */
        public static final List<String> f43548a = C3658U2.m19204a("key", "value", "type");
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$d */
    public static final class d {

        /* renamed from: a */
        public static final List<String> f43549a = C3658U2.m19204a("id", "number", "global_number", "number_of_type", "name", "value", "type", "time", "session_id", "wifi_network_info", "cell_info", "location_info", "error_environment", "user_info", "session_type", "app_environment", "app_environment_revision", "truncated", "connection_type", "cellular_connection_type", "custom_type", "wifi_access_point", "encrypting_mode", "profile_id", "first_occurrence_status", "battery_charge_type", "collection_mode", "has_omitted_data", "call_state", "source", "attribution_id_changed", "open_id");

        /* renamed from: b */
        public static final String f43550b;

        static {
            StringBuilder m24u = C0000a.m24u("CREATE TABLE IF NOT EXISTS reports (id INTEGER PRIMARY KEY,name TEXT,value TEXT,number INTEGER,global_number INTEGER,number_of_type INTEGER,type INTEGER,time INTEGER,session_id TEXT,wifi_network_info TEXT DEFAULT '',cell_info TEXT DEFAULT '',location_info TEXT DEFAULT '',error_environment TEXT,user_info TEXT,session_type INTEGER DEFAULT ");
            m24u.append(EnumC4462z6.FOREGROUND.m21291a());
            m24u.append(",");
            m24u.append("app_environment");
            m24u.append(" TEXT DEFAULT '");
            C0000a.m2C(m24u, "{}", "',", "app_environment_revision", " INTEGER DEFAULT ");
            m24u.append(0L);
            m24u.append(",");
            m24u.append("truncated");
            m24u.append(" INTEGER DEFAULT 0,");
            m24u.append("connection_type");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(2);
            C0000a.m2C(m24u, ",", "cellular_connection_type", " TEXT,", "custom_type");
            C0000a.m2C(m24u, " INTEGER DEFAULT 0, ", "wifi_access_point", " TEXT, ", "encrypting_mode");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(EnumC4141mn.NONE.m20405a());
            m24u.append(", ");
            m24u.append("profile_id");
            m24u.append(" TEXT, ");
            m24u.append("first_occurrence_status");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(0);
            m24u.append(", ");
            m24u.append("battery_charge_type");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(C3456M.b.a.UNKNOWN.m18537a());
            m24u.append(", ");
            m24u.append("collection_mode");
            m24u.append(" TEXT, ");
            m24u.append("has_omitted_data");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(-1);
            m24u.append(", ");
            m24u.append("call_state");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(0);
            m24u.append(", ");
            m24u.append("source");
            m24u.append(" INTEGER DEFAULT ");
            m24u.append(0);
            m24u.append(", ");
            m24u.append("attribution_id_changed");
            m24u.append(" INTEGER DEFAULT 0, ");
            m24u.append("open_id");
            m24u.append(" INTEGER DEFAULT ");
            f43550b = C0000a.m19p(m24u, new C3696Vf.d.a().f44290x, " )");
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.O8$e */
    public static final class e {

        /* renamed from: a */
        public static final List<String> f43551a = C3658U2.m19204a("id", "start_time", "network_info", "report_request_parameters", "server_time_offset", "type", "obtained_before_first_sync");

        /* renamed from: b */
        public static final String f43552b;

        /* renamed from: c */
        public static final String f43553c;

        /* renamed from: d */
        public static final String f43554d;

        static {
            StringBuilder m24u = C0000a.m24u("CREATE TABLE IF NOT EXISTS sessions (id INTEGER,start_time INTEGER,network_info TEXT,report_request_parameters TEXT,server_time_offset INTEGER,type INTEGER DEFAULT ");
            m24u.append(EnumC4462z6.FOREGROUND.m21291a());
            m24u.append(",");
            m24u.append("obtained_before_first_sync");
            m24u.append(" INTEGER DEFAULT 0 )");
            f43552b = m24u.toString();
            Locale locale = Locale.US;
            f43553c = String.format(locale, "SELECT DISTINCT %s  FROM %s WHERE %s >=0 AND (SELECT count() FROM %5$s WHERE %5$s.%6$s = %2$s.%3$s AND %5$s.%7$s = %2$s.%4$s) > 0 ORDER BY %3$s LIMIT 1", "report_request_parameters", "sessions", "id", "type", "reports", "session_id", "session_type");
            f43554d = String.format(locale, "(select count(%s.%s) from %s where %s.%s = %s.%s) = 0 and cast(%s as integer) < ?", "reports", "id", "reports", "reports", "session_id", "sessions", "id", "id");
        }
    }

    static {
        C4360v8 c4360v8 = new C4360v8();
        f43539b = c4360v8;
        C4412x8 c4412x8 = new C4412x8();
        f43540c = c4412x8;
        f43541d = new C4334u8(c4360v8, c4412x8, new C3265E8.b());
    }

    /* renamed from: a */
    public static C4334u8 m18663a() {
        return f43541d;
    }
}
