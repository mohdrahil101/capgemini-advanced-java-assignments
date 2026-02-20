package collection_and_stream;

public static List<List<String>> helper(List<List<String>> logs){
	List<List<String>> filtered=new ArrayList<>();
	for(List<String> l: logs) {
		if( l.get(2).equals("ERROR") || l.get(2).equals("CRITICAL")) {
			filtered.add(l);
		}
	}
		Collections.sort(filtered, (a,b)->{
			long timeA=CovertToLong(a.get(0),a.get(1));
			long timeB=CovertToLong(b.get(0),b.get(1));
			return Long.compare(timeA,timeB);
		});
		return filtered;
}

public static long CovertToLong(String date,String time) {
	String day[]=date.split("-");
	String t[]=time.split(":");
	int d=Integer.parseInt(day[0]);
	int m=Integer.parseInt(day[1]);
	int y=Integer.parseInt(day[2]);
	
	int hr=Integer.parseInt(t[0]);
	int min=Integer.parseInt(t[1]);
	return y*100000000L+m*1000000L+d*10000L+hr*100+min;
}


//<--------------------------------------------------------------------------------------------->

public static List<List<String>> extractLogs(List<List<String>> logs){
	return logs.stream().filter(log -> log.get(2).equals("ERROR") || log.get(2).equals("CRITICAL"))
				.sorted((log1, log2) -> {
					String[] d1 = log1.get(0).split("-");
					String[] d2 = log2.get(0).split("-");

					int year1 = Integer.parseInt(d1[0]);
					int year2 = Integer.parseInt(d2[0]);

					if(year1 != year2) return year1 - year2;

					int month1 = Integer.parseInt(d1[1]);
					int month2 = Integer.parseInt(d2[1]);

					if(mont1 != month2) return month1 - month2;

					int day1 = Integer.parseInt(d1[2]);
					int day2 = Integer.parseInt(d2[2]);

					if(day1 != day2) return day1 - day2;

					String[] t1 = log1.get(1).split(":");
					String[] t2 = log2.get(1).split(":");

					int hour1 = Integer.parseInt(t1[0]);
					int hour2 = Integer.parseInt(t2[0]);

					if(hour1 != hour2) return hour1 - hour2;

					int minute1 = Integer.parseInt(t1[0]);
					int minute2 = Integer.parseInt(t2[0]);

					if(minute1 != minute2) return minute1 - minute2;

				})
				.collect(Collectors.toList());
}
