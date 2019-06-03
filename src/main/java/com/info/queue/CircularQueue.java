package com.info.queue;

/**
 * 
 * @author dileep-thomas
 *
 */
public class CircularQueue {

	int startOfQueue, topOfQueue = -1;
	int[] queue;
	int size;

	public CircularQueue(final int input) {
		queue = new int[size];
		size = input;
	}

	public void enque(int value) {

		if (!isQueueFull()) {

			if (startOfQueue == -1) {
				startOfQueue = 0;
			}

			if (topOfQueue + 1 == size) {
				topOfQueue = 0;
			} else {
				topOfQueue++;
			}

			queue[topOfQueue] = value;
		}

	}

	public void deque() {

		if (!isQueueEmpty()) {

			queue[startOfQueue] = 0;

			if (startOfQueue == topOfQueue) {
				startOfQueue = -1;
				topOfQueue = -1;
			} else if (startOfQueue + 1 == size) {
				startOfQueue = 0;
			} else {
				startOfQueue++;
			}

		}

	}

	public boolean isQueueEmpty() {
		if (topOfQueue == -1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isQueueFull() {

		if (startOfQueue == 0 && topOfQueue + 1 == size) {
			return true;
		} else if (topOfQueue + 1 == startOfQueue) {
			return true;
		} else {
			return false;
		}

	}
}
