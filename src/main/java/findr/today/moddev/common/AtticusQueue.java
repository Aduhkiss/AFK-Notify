package findr.today.moddev.common;

import java.util.ArrayList;
import java.util.List;

public class AtticusQueue {
	
	private List<String> StringQueue;
	
	public AtticusQueue() {
		StringQueue = new ArrayList<>();
	}
	
	public String getNext() {
		return StringQueue.get(0);
	}
	
	public int getSize() {
		return StringQueue.size();
	}
	
	public void add(String name) {
		if(inQueue(name)) return;
		StringQueue.add(name);
	}
	
	public void remove(String name) {
		if(!inQueue(name)) return;
		StringQueue.remove(name);
	}
	
	public int getPosition(String name) {
		if(!inQueue(name)) return 0;
		
		for(int i = 0; i < StringQueue.size(); i++) {
			String check = StringQueue.get(i);
			if(check.equalsIgnoreCase(name)) {
				return i;
			}
		}
		return 0;
	}
	
	public void clear() {
		StringQueue.clear();
	}
	
	public boolean inQueue(String name) {
		if(StringQueue.contains(name)) {
			return true;
		}
		return false;
	}
	
}
