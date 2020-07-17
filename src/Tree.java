
public class Tree {
	private confusingNode headNode;
	public Tree() {
		
	}
	public void add(int x) {
		if(headNode == null) {
			headNode = new confusingNode(x);
		}
		else {
			addRecursion(x, headNode);
		}
	}
	public void addRecursion(int x, confusingNode newNode) {
		if(x > newNode.getData()) {
			if(newNode.getRightNode() == null) {
				confusingNode tempNode = new confusingNode(x);
				newNode.setRightNode(tempNode);
				// add to right
			}
			else {
				addRecursion(x, newNode = newNode.getRightNode());
			}
		}
		else if(x <= newNode.getData()) {
			if(newNode.getLeftNode() == null) {
				confusingNode tempNode = new confusingNode(x);
				// THIS THING
				newNode.setLeftNode(tempNode);
				// add to left
			}
			else {
				addRecursion(x, newNode = newNode.getLeftNode());
			}
		}
		else {
			if(x > newNode.getData()) {
				addRecursion(x, newNode = newNode.getRightNode());
				// move down right
			}
			else if(x <= newNode.getData()) {
				addRecursion(x, newNode = newNode.getLeftNode());
				// move down left
			}
		}
	}
	public void remove(int x) {
		removeRecursion(x, headNode);
	}
	public void removeRecursion(int x, confusingNode newNode) {
		if(x == headNode.getData()) {
			if(headNode.getRightNode() != null) {
				if(headNode.getLeftNode() == null) {
					confusingNode tempNode = new confusingNode(x);
					tempNode = headNode.getRightNode();
					headNode = tempNode;
					return;
				}
				else {
					confusingNode rightTempNode = new confusingNode(x);
					rightTempNode = headNode.getRightNode();
					while(rightTempNode.getLeftNode() != null) {
						rightTempNode = rightTempNode.getLeftNode();
					}
					confusingNode leftTempNode = new confusingNode(x);
					leftTempNode = headNode.getLeftNode();
					while(leftTempNode.getRightNode() != null) {
						leftTempNode = leftTempNode.getRightNode();
					}
					int rightNumber = headNode.getData() - rightTempNode.getData();
					rightNumber = java.lang.Math.abs(rightNumber);
					int leftNumber = headNode.getData() - leftTempNode.getData();
					leftNumber = java.lang.Math.abs(leftNumber);
					if(rightNumber < leftNumber) {
						confusingNode lTempNode = new confusingNode(x);
						confusingNode rTempNode = new confusingNode(x);
						lTempNode = headNode.getLeftNode();
						rTempNode = headNode.getRightNode();
						headNode = rightTempNode;
						headNode.setLeftNode(lTempNode);
						if(rTempNode != rightTempNode) {
							headNode.setRightNode(rTempNode);
						}
						return;
					}
					else if(leftNumber < rightNumber) {
						confusingNode rTempNode = new confusingNode(x);
						confusingNode lTempNode = new confusingNode(x);
						rTempNode = headNode.getRightNode();
						lTempNode = headNode.getLeftNode();
						headNode = leftTempNode;
						headNode.setRightNode(rTempNode);
						if(lTempNode != leftTempNode) {
							headNode.setLeftNode(lTempNode);
						}
						return;
					}
					else if(rightNumber == leftNumber) {
						confusingNode lTempNode = new confusingNode(x);
						confusingNode rTempNode = new confusingNode(x);
						lTempNode = headNode.getLeftNode();
						rTempNode = headNode.getRightNode();
						headNode = rightTempNode;
						headNode.setLeftNode(lTempNode);
						if(rTempNode != rightTempNode) {
							headNode.setRightNode(rTempNode);
						}
						return;
					}
				}
			}
		}
		if(x > newNode.getData()) {
			if(newNode.getRightNode().getData() == x) {
				if(newNode.getRightNode().getRightNode() != null) {
					if(newNode.getRightNode().getLeftNode() == null) {
						confusingNode tempNode = new confusingNode(x);
						tempNode = newNode.getRightNode().getRightNode();
						newNode.setRightNode(tempNode);
						return;
					}
					else {
						confusingNode rightTempNode = new confusingNode(x);
						rightTempNode = newNode.getRightNode().getRightNode();
						while(rightTempNode.getLeftNode() != null) {
							rightTempNode = rightTempNode.getLeftNode();
						}
						confusingNode leftTempNode = new confusingNode(x);
						leftTempNode = newNode.getRightNode().getLeftNode();
						while(leftTempNode.getRightNode() != null) {
							leftTempNode = leftTempNode.getRightNode();
						}
						int rightNumber = newNode.getRightNode().getData() - rightTempNode.getData();
						rightNumber = java.lang.Math.abs(rightNumber);
						int leftNumber = newNode.getRightNode().getData() - leftTempNode.getData();
						leftNumber = java.lang.Math.abs(leftNumber);
						if(rightNumber < leftNumber) {
							confusingNode lTempNode = new confusingNode(x);
							confusingNode rTempNode = new confusingNode(x);
							lTempNode = newNode.getRightNode().getLeftNode();
							rTempNode = newNode.getRightNode().getRightNode();
							newNode.setRightNode(rightTempNode);
							newNode = newNode.getRightNode();
							newNode.setLeftNode(lTempNode);
							if(rTempNode != rightTempNode) {
								newNode.setRightNode(rTempNode);
							}
							return;
						}
						else if(leftNumber < rightNumber) {
							confusingNode rTempNode = new confusingNode(x);
							confusingNode lTempNode = new confusingNode(x);
							rTempNode = newNode.getRightNode().getRightNode();
							lTempNode = newNode.getRightNode().getLeftNode();
							newNode.setRightNode(leftTempNode);
							newNode = newNode.getRightNode();
							newNode.setRightNode(rTempNode);
							if(lTempNode != leftTempNode) {
								newNode.setLeftNode(lTempNode);
							}
							return;
						}
						else if(rightNumber == leftNumber) {
							confusingNode lTempNode = new confusingNode(x);
							confusingNode rTempNode = new confusingNode(x);
							lTempNode = newNode.getRightNode().getLeftNode();
							rTempNode = newNode.getRightNode().getRightNode();
							newNode.setRightNode(rightTempNode);
							newNode = newNode.getRightNode();
							newNode.setLeftNode(lTempNode);
							if(rTempNode != rightTempNode) {
								newNode.setRightNode(rTempNode);
							}
							return;
						}
					}
				}
				else if(newNode.getRightNode().getLeftNode() != null) {
					confusingNode tempNode = new confusingNode(x);
					tempNode = newNode.getRightNode().getLeftNode();
					newNode.setRightNode(tempNode);
					return;
				}
				else {
					newNode.setRightNode(null);
					return;
				}
			}
		}
		if(x <= newNode.getData()) {
			if(newNode.getLeftNode().getData() == x) {
				if(newNode.getLeftNode().getRightNode() != null) {
					if(newNode.getLeftNode().getLeftNode() == null) {
						confusingNode tempNode = new confusingNode(x);
						tempNode = newNode.getLeftNode().getRightNode();
						newNode.setLeftNode(tempNode);
						return;
					}
					else {
						confusingNode rightTempNode = new confusingNode(x);
						rightTempNode = newNode.getLeftNode().getRightNode();
						while(rightTempNode.getLeftNode() != null) {
							rightTempNode = rightTempNode.getLeftNode();
						}
						confusingNode leftTempNode = new confusingNode(x);
						leftTempNode = newNode.getLeftNode().getLeftNode();
						while(leftTempNode.getRightNode() != null) {
							leftTempNode = leftTempNode.getRightNode();
						}
						int rightNumber = newNode.getLeftNode().getData() - rightTempNode.getData();
						rightNumber = java.lang.Math.abs(rightNumber);
						int leftNumber = newNode.getLeftNode().getData() - leftTempNode.getData();
						leftNumber = java.lang.Math.abs(leftNumber);
						if(rightNumber < leftNumber) {
							confusingNode lTempNode = new confusingNode(x);
							confusingNode rTempNode = new confusingNode(x);
							lTempNode = newNode.getLeftNode().getLeftNode();
							rTempNode = newNode.getLeftNode().getRightNode();
							newNode.setRightNode(rightTempNode);
							newNode = newNode.getLeftNode();
							newNode.setLeftNode(lTempNode);
							if(rTempNode != rightTempNode) {
								newNode.setRightNode(rTempNode);
							}
							return;
						}
						else if(leftNumber < rightNumber) {
							confusingNode rTempNode = new confusingNode(x);
							confusingNode lTempNode = new confusingNode(x);
							rTempNode = newNode.getLeftNode().getRightNode();
							lTempNode = newNode.getLeftNode().getLeftNode();
							newNode.setLeftNode(leftTempNode);
							newNode = newNode.getLeftNode();
							newNode.setRightNode(rTempNode);
							if(lTempNode != leftTempNode) {
								newNode.setLeftNode(lTempNode);
							}
							return;
						}
						else if(rightNumber == leftNumber) {
							confusingNode lTempNode = new confusingNode(x);
							confusingNode rTempNode = new confusingNode(x);
							lTempNode = newNode.getLeftNode().getLeftNode();
							rTempNode = newNode.getLeftNode().getRightNode();
							newNode.setLeftNode(rightTempNode);
							newNode = newNode.getLeftNode();
							newNode.setLeftNode(lTempNode);
							if(rTempNode != rightTempNode) {
								newNode.setRightNode(rTempNode);
							}
							return;
						}
					}
				}
				else if(newNode.getLeftNode().getLeftNode() != null) {
					confusingNode tempNode = new confusingNode(x);
					tempNode = newNode.getLeftNode().getLeftNode();
					newNode.setLeftNode(tempNode);
					return;
				}
				else {
					newNode.setLeftNode(null);
					return;
				}
			}
		}
		if(x > newNode.getData()) {
			removeRecursion(x, newNode = newNode.getRightNode());
			// move down right
		}
		else if(x <= newNode.getData()) {
			removeRecursion(x, newNode = newNode.getLeftNode());
			// move down left
		}	
	}
	public String toString() {
		return recursiveToString(headNode);
	}
	public String recursiveToString(confusingNode newNode) {
		String temp = "";
		if(newNode.getRightNode() != null && newNode.getLeftNode() == null) {
			// only one node on the right
			temp = temp + "This node contains " + newNode.getData() + /*", with a right node of " + newNode.getRightNode().getData() +*/ "\n" + recursiveToString(newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() != null) {
			// only one node on the left
			temp = temp + "This node contains " + newNode.getData() +/* ", with a left node of " + newNode.getLeftNode().getData() +*/ "\n" + recursiveToString(newNode.getLeftNode());
		}
		else if(newNode.getRightNode() != null && newNode.getLeftNode() != null) {
			// one node on both right and left
			temp = temp + "This node contains " + newNode.getData() + /*", with a left node of " + newNode.getLeftNode().getData() + ", and with a right node of " + newNode.getRightNode().getData() +*/ "\n" + recursiveToString(newNode.getLeftNode());
			temp += recursiveToString(newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() == null) {
			// no nodes on both right and left
			temp = temp + "This node contains " + newNode.getData() + "\n";
			return temp;
		}
		return temp;
	}
	public void get(int x) {
		getNodeRecursion(x, headNode, "");
	}
	public void getNodeRecursion(int x, confusingNode newNode, String location) {
		if(newNode == headNode) {
			location = "Starting from the head node, " + x + " is ";
		}
		int rightNum = 0;
		int leftNum = 0;
		if(x == headNode.getData()) {
			location = x + " is the head node";
			System.out.println(location);
			return;
		}
		if(x > newNode.getData()) {
			boolean loop = true;
			while(loop) {
				if(newNode.getRightNode() == null) {
					rightNum++;
					loop = false;
				}
				if(x <= newNode.getRightNode().getData()) {
					loop = false;
				}
				rightNum++;
				newNode = newNode.getRightNode();
			}
			if(newNode.getRightNode() == null) {
				location = location + rightNum + " to the right";
				System.out.println(location);
				return;
			}
			if(newNode.getData() == x) {
				location = location + rightNum + " to the right";
				System.out.println(location);
				return;
			}
				location = location + rightNum + " to the right, ";
		}
		if(x <= newNode.getData()) {
			boolean loop = true;
			while(loop) {
				if(newNode.getLeftNode() == null) {
					leftNum++;
					loop = false;
				}
				if(x >= newNode.getLeftNode().getData()) {
					loop = false;
				}
				leftNum++;
				newNode = newNode.getLeftNode();
			}
			if(newNode.getLeftNode() == null) {
				location = location + leftNum + " to the left";
				System.out.println(location);
				return;
			}
			if(newNode.getData() == x) {
				location = location + leftNum + " to the left";
				System.out.println(location);
				return;
			}
				location = location + leftNum + " to the left, ";
		}
		getNodeRecursion(x, newNode, location);
	}
	public void print() {
		truePrint(headNode);
	}
	public void truePrint(confusingNode newNode) {
		if(newNode.getRightNode() != null && newNode.getLeftNode() == null) {
			System.out.print("This node contains " + newNode.getData() + ", with a right node of " + newNode.getRightNode().getData() + "\n");
			truePrint(newNode.getRightNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() != null) {
			System.out.print("This node contains " + newNode.getData() + ", with a left node of " + newNode.getLeftNode().getData() + "\n");
			truePrint(newNode.getLeftNode());
		}
		else if(newNode.getRightNode() != null && newNode.getLeftNode() != null) {
			System.out.print("This node contains " + newNode.getData() + ", with a left node of " + newNode.getLeftNode().getData() + ", and with a right node of " + newNode.getRightNode().getData() + "\n");
			truePrint(newNode.getRightNode());
			truePrint(newNode.getLeftNode());
		}
		else if(newNode.getRightNode() == null && newNode.getLeftNode() == null) {
			System.out.print("This node contains " + newNode.getData() + "\n");
			return;
		}
		return;
	}
}
