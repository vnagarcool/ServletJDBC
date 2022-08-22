package com.model;
public abstract class Search {
public static String date;
public static String day;
public static String source;
public static String destination;
public static int persons;
public static String getQuery() {
return &quot;SELECT * FROM flight WHERE Source = &#39;&quot;+source+&quot;&#39;
AND Destination=&#39;&quot;+destination+&quot;&#39;AND Day=&#39;&quot;+day+&quot;&#39;&quot;;
}
}